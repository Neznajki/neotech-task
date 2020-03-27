package com.neotech.web;

import com.neotech.app.Container;
import com.neotech.app.Executor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.servlet.MockMvc;

import java.lang.reflect.Field;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WebApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ApplicationContext mockConfig;
    @MockBean
    private Executor mockExecutor;

    @Test
    void contextLoads() throws Exception {
        Field containerField = Container.class.getDeclaredField("instance");
        containerField.setAccessible(true);
        containerField.set(null, mockConfig);
        String expectingResponse = "unit test";
        String phone = "+111111";

        Mockito.when(mockConfig.getBean(Executor.class)).thenReturn(mockExecutor);
        Mockito.when(mockExecutor.execute(phone)).thenReturn(expectingResponse);

        this.mockMvc.perform(get("/rest/json/check/phone")
                .param("phone", phone))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(expectingResponse));

        containerField.set(null, null);

    }

}

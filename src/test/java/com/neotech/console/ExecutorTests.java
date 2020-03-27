package com.neotech.console;

import com.neotech.app.Container;
import com.neotech.app.Executor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

@RunWith(SpringRunner.class)
public class ExecutorTests {
    @MockBean
    private ApplicationContext mockConfig;
    @MockBean
    private Executor mockExecutor;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test(expected = RuntimeException.class)
    public void exceptionTest() {
        com.neotech.console.Executor.main(new String[]{});
    }

    @Test
    public void executeTest() throws NoSuchFieldException, IllegalAccessException {
        Field containerField = Container.class.getDeclaredField("instance");
        containerField.setAccessible(true);
        containerField.set(null, mockConfig);

        String phone = "+111111";
        String expectingResponse = "unit test";
        Mockito.when(mockConfig.getBean(Executor.class)).thenReturn(mockExecutor);
        Mockito.when(mockExecutor.execute(phone)).thenReturn(expectingResponse);

        outContent.reset();
        com.neotech.console.Executor.main(new String[]{phone});
        Assert.assertEquals(expectingResponse.concat("\n"), outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}

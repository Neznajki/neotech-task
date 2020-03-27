package com.neotech.app;

import com.neotech.web.response.converter.JsonResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Executor.class)
public class ExecutorTests {
    @Autowired
    Executor executor;

    @Test
    public void testPhoneGetting()
    {
        Assert.assertEquals("{\n" +
                "  \"exceptionMessage\" : null,\n" +
                "  \"result\" : {\n" +
                "    \"type\" : \"country\",\n" +
                "    \"name\" : \"United States\",\n" +
                "    \"code\" : \"US\",\n" +
                "    \"matchedPhoneCode\" : \"1\"\n" +
                "  }\n" +
                "}", executor.execute("+1111"));
    }

    @Test
    public void testInvalidPhoneFormat()
    {
        Assert.assertEquals("{\n" +
                "  \"exceptionMessage\" : \"(1111) phone should begin with +\",\n" +
                "  \"result\" : null\n" +
                "}", executor.execute("1111"));
    }

    @Test
    public void testInvalidPhoneSymbols()
    {
        Assert.assertEquals("{\n" +
                "  \"exceptionMessage\" : \"(+111ss1) phone should look like phone +371 1123 // +1 (555) [111] 4555 // +15555\",\n" +
                "  \"result\" : null\n" +
                "}", executor.execute("+111ss1"));
    }

    @Test
    public void testPhoneNotFound()
    {
        Assert.assertEquals("{\n" +
                "  \"exceptionMessage\" : \"could not found phone data for phone +21\",\n" +
                "  \"result\" : null\n" +
                "}", executor.execute("+21"));
    }

    @Test
    public void testCommentItem()
    {
        Assert.assertEquals("{\n" +
                "  \"exceptionMessage\" : null,\n" +
                "  \"result\" : {\n" +
                "    \"commentContent\" : \"unassigned\",\n" +
                "    \"matchedPhoneCode\" : \"214\"\n" +
                "  }\n" +
                "}", executor.execute("+21444"));
    }

    @Test
    public void fatalExceptionTest() throws Throwable {
        ApplicationContext mockConfig = Mockito.mock(ApplicationContext.class);
        JsonResponse responseParser = Mockito.mock(JsonResponse.class);

        Field containerField = Container.class.getDeclaredField("instance");
        containerField.setAccessible(true);
        containerField.set(null, mockConfig);

        Mockito.when(mockConfig.getBean(JsonResponse.class)).thenReturn(responseParser);
        Mockito.when(responseParser.getJsonString(Mockito.any())).thenThrow(new RuntimeException("unit test"));

        Assert.assertEquals("fatal exception !!", executor.execute("11"));

        containerField.set(null, null);
    }
}

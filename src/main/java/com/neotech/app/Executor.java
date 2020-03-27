package com.neotech.app;

import com.neotech.exception.InvalidPhoneException;
import com.neotech.exception.StateNotChangedException;
import com.neotech.phone.RawPhoneEntity;
import com.neotech.phone.di.Handler;
import com.neotech.web.Response;
import com.neotech.web.response.converter.JsonResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Executor {
    public String execute(String phone)
    {
        var response = new Response(new StateNotChangedException("response is not assigned"));

        try {
            var handler = Container.getContainerInstance().getBean(Handler.class);
            var phoneData = new RawPhoneEntity(phone);

            handler.validatePhone(phoneData);

            response = new Response(handler.getPhoneEntry(phoneData));
        } catch (InvalidPhoneException exception) {
            response = new Response(exception);
        }

        try {
            return Container.getContainerInstance().getBean(JsonResponse.class).getJsonString(response);
        } catch (Throwable exception) {
            // could add logger to log somewhere
            return handleFinalException(exception);
        }
    }

    private String handleFinalException(Throwable exception) {
        Response response;
        try {
            response = new Response(exception);

            return Container.getContainerInstance().getBean(JsonResponse.class).getJsonString(response);
        } catch (Throwable e) {
            Logger logger = LogManager.getLogger(Executor.class);
            logger.fatal("fatal exception !!", e);

            return "fatal exception !!";
        }
    }
}

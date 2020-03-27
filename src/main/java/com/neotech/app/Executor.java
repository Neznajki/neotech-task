package com.neotech.app;

import com.neotech.exception.InvalidPhoneException;
import com.neotech.exception.StateNotChangedException;
import com.neotech.phone.RawPhoneEntity;
import com.neotech.phone.di.Handler;
import com.neotech.web.Response;
import com.neotech.web.response.converter.JsonResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Executor {
    final Handler handler;
    final JsonResponse jsonResponse;

    @Autowired
    public Executor(Handler handler, JsonResponse jsonResponse) {
        this.handler = handler;
        this.jsonResponse = jsonResponse;
    }

    public String execute(String phone)
    {
        var response = new Response(new StateNotChangedException("response is not assigned"));

        try {
            var phoneData = new RawPhoneEntity(phone);

            this.handler.validatePhone(phoneData);

            response = new Response(this.handler.getPhoneEntry(phoneData));
        } catch (InvalidPhoneException exception) {
            response = new Response(exception);
        }

        try {
            return this.jsonResponse.getJsonString(response);
        } catch (Throwable exception) {
            // could add logger to log somewhere
            return handleResponseParseException(exception);
        }
    }

    private String handleResponseParseException(Throwable exception) {
        Response response;
        try {
            response = new Response(exception);

            return this.jsonResponse.getJsonString(response);
        } catch (Throwable e) {
            Logger logger = LogManager.getLogger(Executor.class);
            logger.fatal("fatal exception !!", e);

            return "fatal exception !!";
        }
    }
}

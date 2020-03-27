package com.neotech.app;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.neotech.exception.InvalidPhoneException;
import com.neotech.exception.StateNotChangedException;
import com.neotech.phone.RawPhoneEntity;
import com.neotech.web.Response;

public class Executor {
    public String execute(String phone)
    {
        var response = new Response(new StateNotChangedException("response is not assigned"));

        try {
            var handler = Container.getInstance().getHandler();
            var phoneData = new RawPhoneEntity(phone);

            handler.validatePhone(phoneData);

            response = new Response(handler.getPhoneEntry(phoneData));
        } catch (InvalidPhoneException exception) {
            response = new Response(exception);
        }

        try {
            Container.getInstance().getJsonObjectMapper().setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

            return Container.getInstance().getJsonResponse().getJsonString(response);
        } catch (Throwable exception) {
            // could add logger to log somewhere
            return "something got wrong please report";
        }
    }
}

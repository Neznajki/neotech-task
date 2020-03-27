package com.neotech.web.response.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neotech.app.Container;
import com.neotech.web.Response;

public class JsonResponse {
    public String getJsonString(Response data) throws JsonProcessingException {
        return this.getMapper().writerWithDefaultPrettyPrinter().writeValueAsString(data);
    }

    protected ObjectMapper getMapper() {
        return Container.getInstance().getJsonObjectMapper();
    }
}

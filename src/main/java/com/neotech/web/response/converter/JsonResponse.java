package com.neotech.web.response.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neotech.web.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsonResponse {
    ObjectMapper objectMapper;

    @Autowired
    public JsonResponse(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String getJsonString(Response data) throws JsonProcessingException {
        return this.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
    }
}

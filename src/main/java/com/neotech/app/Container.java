package com.neotech.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neotech.phone.FullCollection;
import com.neotech.phone.Handler;
import com.neotech.phone.Validator;
import com.neotech.web.response.converter.JsonResponse;

import java.util.HashMap;

public class Container {
    private static Container instance = new Container();

    public static Container getInstance() {
        return instance;
    }

    private HashMap<String, Object> services = new HashMap<>();

    public void set(String name, Object instance)
    {
        if (this.services.containsKey(name)) {
            throw new RuntimeException(String.format("instance %s already exists in container", name));
        }

        this.services.put(name, instance);
    }

    public Handler getHandler()
    {
        String className = Handler.class.getSimpleName();
        if (! this.services.containsKey(className)) {
            this.set(className, new Handler());
        }

        return (Handler) this.services.get(className);
    }

    public Validator getValidator()
    {
        String className = Validator.class.getSimpleName();
        if (! this.services.containsKey(className)) {
            this.set(className, new Validator());
        }

        return (Validator) this.services.get(className);
    }

    public ObjectMapper getJsonObjectMapper()
    {
        String className = ObjectMapper.class.getSimpleName();
        if (! this.services.containsKey(className)) {
            this.set(className, new ObjectMapper());
        }

        return (ObjectMapper) this.services.get(className);
    }

    public JsonResponse getJsonResponse()
    {
        String className = JsonResponse.class.getSimpleName();
        if (! this.services.containsKey(className)) {
            this.set(className, new JsonResponse());
        }

        return (JsonResponse) this.services.get(className);
    }

    public Executor getExecutor()
    {
        String className = Executor.class.getSimpleName();
        if (! this.services.containsKey(className)) {
            this.set(className, new Executor());
        }

        return (Executor) this.services.get(className);
    }

    public FullCollection getFullCollection()
    {
        String className = FullCollection.class.getSimpleName();
        if (! this.services.containsKey(className)) {
            this.set(className, new FullCollection());
        }

        return (FullCollection) this.services.get(className);
    }
}

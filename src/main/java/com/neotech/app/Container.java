package com.neotech.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Container {
    protected static ApplicationContext instance;
    public static ApplicationContext getContainerInstance()
    {
        if (instance == null) {
            instance = new AnnotationConfigApplicationContext(ApiConfig.class);
        }

        return instance;
    }
}

package com.neotech.console;

import com.neotech.app.Container;

public class Executor {
    public static void main(String[] args)
    {
        if (args.length == 0) {
            throw new RuntimeException("phone parameter is required");
        }
        System.out.println(Container.getContainerInstance().getBean(com.neotech.app.Executor.class).execute(args[0]));
    }
}

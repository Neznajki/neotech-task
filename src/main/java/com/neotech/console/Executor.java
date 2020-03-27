package com.neotech.console;

import com.neotech.app.Container;

public class Executor {
    public static void main(String[] args)
    {
        if (args.length == 0) {
            throw new RuntimeException("phone parameter is required");
        }
        System.out.println(Container.getInstance().getExecutor().execute(args[0]));
    }
}

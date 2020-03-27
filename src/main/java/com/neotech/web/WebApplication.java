package com.neotech.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext context) {
//        return args -> {
//            if (args.length == 0) {
//                throw new RuntimeException("phone parameter is required");
//            }
//
//            System.out.println(context.getBean(com.neotech.app.Executor.class).execute(args[0]));
//        };
//    }
}

package com.neotech.web;

import com.neotech.app.Container;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApplication {
    private static final String phoneCheckerPath = "/rest/json/check/phone";

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @GetMapping(phoneCheckerPath)
    public String phoneChecker(@RequestParam(value = "phone", defaultValue = "") String phone) {
        return Container.getInstance().getExecutor().execute(phone);
    }
}

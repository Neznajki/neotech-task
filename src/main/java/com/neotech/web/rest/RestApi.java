package com.neotech.web.rest;

import com.neotech.app.Container;
import com.neotech.app.Executor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class RestApi {
    @GetMapping("/json/check/phone")
    public String phoneChecker(
        @RequestParam(value = "phone", defaultValue = "") String phone
    ) {
        return Container.getContainerInstance().getBean(Executor.class).execute(phone);
    }
}

package com.neotech.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebGUI {

    @GetMapping("")
    public ModelAndView homepage(@RequestParam(name = "phone", defaultValue = "444") String phone)
    {
        ModelAndView view = new ModelAndView("layout");
        view.addObject("phone", phone);

        return view;
    }
}

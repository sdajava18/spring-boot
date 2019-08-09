package com.sda.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String showHelloPage(ModelMap model, @RequestParam(name = "imie", defaultValue = "Nieznajomy") String name){

        model.addAttribute("imie", name);
        return "hello";
    }
}

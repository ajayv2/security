package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/signin")
    public String signin(){
        System.out.println("this is login custom page");
        return "login";
    }
}
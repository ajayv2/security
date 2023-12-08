package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @GetMapping("/login")
    public String login(){
        return "This is login page";
    }

    @GetMapping("/registration")
    public String registration(){
        return "This is registration page";
    }
}

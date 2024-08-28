package com.demo.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Spring Web";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hello... I'm a Learning Spring";
    }
}

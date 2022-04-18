package com.example.blondiebytes.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String getGreeting() {
       return "hello world I like pizza";
    }
    @RequestMapping("/greeting")
    public String getNewGreeting() {
        return "this is the /greeting route";
    }
}


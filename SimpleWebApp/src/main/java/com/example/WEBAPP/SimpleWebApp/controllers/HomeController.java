package com.example.WEBAPP.SimpleWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet()
    {
        System.out.println("I'm Here");
        return "Hello";
    }
    @RequestMapping("/about")
    public String about()
    {
        return "Hello Alone";
    }

}

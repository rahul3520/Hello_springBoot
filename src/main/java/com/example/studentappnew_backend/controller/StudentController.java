package com.example.studentappnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to my website";
    }

    @GetMapping("/contact")
    public String Contactpage()
    {
        return "Welcome to contact page";
    }

    @GetMapping("/gallery")
    public String Gallery()
    {
        return "Welcome to gallery page";
    }

    @GetMapping("/home")
    public String Home()
    {
        return "Welcome to home page";
    }

}

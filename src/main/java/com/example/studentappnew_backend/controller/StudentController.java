package com.example.studentappnew_backend.controller;

import com.example.studentappnew_backend.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to my website";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addStudentpage(@RequestBody Students s)
    {
        System.out.println(s.getName().toString());
        System.out.println(s.getAdmno().toString());
        //System.out.println(s.getRollno());
        System.out.println(s.getCollege().toString());
        return "Welcome to add student page";
    }

}

package com.example.studentappnew_backend.controller;

import com.example.studentappnew_backend.dao.StudentDao;
import com.example.studentappnew_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins="*")
    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to my website";
    }

    @CrossOrigin(origins="*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> addStudentpage(@RequestBody Students s)
    {
        HashMap<String,String> map=new HashMap<>();

        System.out.println(s.getName().toString());
        System.out.println(s.getAdmno().toString());
        System.out.println(s.getRollno());
        System.out.println(s.getCollege().toString());

        dao.save(s);

        map.put("status","success");

        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> ViewStudents()
    {
        return (List<Students>) dao.findAll();
    }

}

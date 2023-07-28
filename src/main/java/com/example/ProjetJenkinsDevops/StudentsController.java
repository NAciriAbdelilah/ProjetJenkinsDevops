package com.example.ProjetJenkinsDevops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentService service;
    @GetMapping("/lab")
    public String getLab(){
        return "bonjour";
    }
    //--------------------getAllStudents------------------------//
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = service.getAllStudents();
        return students;
    }
}

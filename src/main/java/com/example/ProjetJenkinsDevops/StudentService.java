package com.example.ProjetJenkinsDevops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repositoryStudent;

    public List<Student> getAllStudents() {
        List<Student> students = (List<Student>) repositoryStudent.findAll();
        return students;
    }
}
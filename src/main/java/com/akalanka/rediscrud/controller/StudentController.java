package com.akalanka.rediscrud.controller;

import com.akalanka.rediscrud.entity.Student;
import com.akalanka.rediscrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public void addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }
}

package com.akalanka.rediscrud.controller;

import com.akalanka.rediscrud.entity.Student;
import com.akalanka.rediscrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public void addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getall")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/update/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable Long id){
        studentService.updateStudent(student, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }
}

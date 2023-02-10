package com.akalanka.rediscrud.service;

import com.akalanka.rediscrud.entity.Student;
import com.akalanka.rediscrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}

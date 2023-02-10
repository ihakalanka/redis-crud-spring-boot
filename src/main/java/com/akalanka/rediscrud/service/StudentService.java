package com.akalanka.rediscrud.service;

import com.akalanka.rediscrud.entity.Student;
import com.akalanka.rediscrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(String id){
        return studentRepository.findById(id).get();
    }

    public Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public ResponseEntity<String> deleteStudentById(String id){
        studentRepository.deleteById(id);
        return ResponseEntity.ok("Student Deleted");
    }

    public ResponseEntity<String> updateStudent(Student student, String id){
        Student student1 = studentRepository.findById(id).get();
        student1.setName(student.getName());
        student1.setAddress(student.getAddress());
        student1.setEmail(student.getEmail());
        studentRepository.save(student1);
        return ResponseEntity.ok("Student Updated");
    }
}

package com.akalanka.rediscrud.repository;

import com.akalanka.rediscrud.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}

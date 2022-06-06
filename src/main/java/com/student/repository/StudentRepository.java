package com.student.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

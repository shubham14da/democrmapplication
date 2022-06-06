package com.student;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.entities.Student;
import com.student.repository.StudentRepository;

@SpringBootTest
class StudentappApplicationTests {

	@Autowired
private StudentRepository studentRepo;
	
	@Test
	void saveOneStudentRecord() {
    Student s = new Student();
    s.setName("manoj");
    s.setCourse("physics");
    s.setFee(5000);
    
    studentRepo.save(s);
	}
	
	@Test
	void deleteOneStudentRecord() {
		studentRepo.deleteById(1L);
	}
	
	@Test
	void findOneStudentRecord() {
		Optional<Student> findById = studentRepo.findById(6L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
		}
	
	@Test
	void updateOneStudentRecord() {
		Optional<Student> findById = studentRepo.findById(6L);
		Student student = findById.get();
         student.setCourse("java");
         
         studentRepo.save(student);
	
	}

}

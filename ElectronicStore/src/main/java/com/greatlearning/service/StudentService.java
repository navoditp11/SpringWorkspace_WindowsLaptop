package com.greatlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Student;
import com.greatlearning.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studrepo;

	public void addStudent(Student s1) {
		studrepo.save(s1);
		
	}

}

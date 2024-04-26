package com.greatlearning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Student;
import com.greatlearning.service.StudentService;

//@Controller
@RestController
public class ElectronicsController {
	
	@Autowired
	StudentService studservice;
	
	@PostMapping("/addStudent")
	public String addStudent(
			@RequestParam("a") int x,
			@RequestParam("b") String y,
			@RequestParam("c") double z) 
	{
		Student s1 = new Student();
		s1.setRno(x);
		s1.setSname(y);
		s1.setPer(z);
		studservice.addStudent(s1);
		return "Student Record added Successfully";
	}
	
	@RequestMapping("/greet")
	public String greet() {
		return "welcome";
	}
	
	@RequestMapping("/getStudent")
	public Student getStudent() {
		Student s1 = new Student();
		s1.setRno(101);
		s1.setSname("Alece");
		s1.setPer(78.5);
		return s1;
	}
	
	@RequestMapping("/getStudents")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(102,"Navodit", 99.5));
		students.add(new Student(103,"Anjali", 89.5));
		students.add(new Student(104,"Nitin", 79.5));
		return students;
	}
	
	@RequestMapping("/ipl")
	public String ipl() {
		return "virat";
	}
	
	@RequestMapping("/testdev")
	public String testdev() {
		return "testdev";
	}

}

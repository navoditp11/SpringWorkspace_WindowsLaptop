package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.entity.Student;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String greet(Model model) {
		
		return "virat";
		
	}
	
//	@RequestMapping("/")
//	public String greet(Model model) {
//		Student s1 = new Student();
//		s1.setRno(101);
//		s1.setSname("Alice");
//		s1.setPer(78.5);
//		                   //key, Value
//		model.addAttribute("mystud",s1);
//		return "virat";
//		
//	}
	
//	@RequestMapping("/")
//	public String greet(Model model) {
//		                   //key, Value  
//		model.addAttribute("myking","Virat Kohli");
//		return "virat";
//		
//	}
	
//	@RequestMapping("/")
//	public String greet(ModelMap modelmap) {
//		                   //key, Value  
//		modelmap.addAttribute("cricketer","Virat Kohli");
//		modelmap.addAttribute("actor","SRK");
//		modelmap.addAttribute("businessman","Mukesh Ambani");
//		return "virat";
//		
//	}
	
//	@RequestMapping("/")
//	public ModelAndView greet() {
//		ModelAndView mav = new ModelAndView("virat");
//		mav.addObject("cricketer","Rohit Sharma");
//		mav.addObject("actor","Deepika Padukone");
//		mav.addObject("businessman","Ratan Tata");
//		return mav;
//
//	}
	
//	@RequestMapping("/")
//	public ModelAndView greet() {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("virat");
//		mav.addObject("cricketer","Rohit Sharma");
//		mav.addObject("actor","Deepika Padukone");
//		mav.addObject("businessman","Ratan Tata");
//		return mav;
//
//	}
	
	@RequestMapping("/march")
	public String mumbaiIndians() {
		return "rohit";
		
	}
	
	@RequestMapping(value = {"/mahendra","/singh","/dhoni"})
	public String chennaiSuperKings() {
		return "csk";
		
	}
	
	@RequestMapping("/register")
	public String studentRegistration(Model model) {
		Student s1 = new Student();
		model.addAttribute("emptyStudentObject", s1);
		return "registration-form";
	}
	
	@RequestMapping("/saveStudentDetails")
	public String studentRegistration(@ModelAttribute("filledStudentObject") Student s2) {
		return "display-registration-details";
	}


}
// localhost:8080/SpringMVC/hello

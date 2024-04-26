package com.rbaintro.RoleBasedAutorisationIntroduction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/getAPI")
	public String greet() {
		return "GET API Invoked";
	}
	
	@GetMapping("/insertAPI")
	public String insert() {
		return "Insert API Invoked";
	}
	
	@GetMapping("/updateAPI")
	public String update() {
		return "Update API Invoked";
	}
	
	@GetMapping("/deleteAPI")
	public String delete() {
		return "Delete API Invoked";
	}

}
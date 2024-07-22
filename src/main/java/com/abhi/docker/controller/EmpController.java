package com.abhi.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@GetMapping("/msg")
	public String getMsg() {
		return "Hi abhishek iam Docker here .. ";
	}

}

package com.ust.EmployeeSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/rest/noauth")
public class EmployeeController2 {

	
	@GetMapping("/goodmorning")
	public String greeting()
	{
		return "hi jenson good morning";
	}

}


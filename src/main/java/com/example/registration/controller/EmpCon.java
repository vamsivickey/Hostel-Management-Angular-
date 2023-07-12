package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.Emp;
import com.example.registration.service.EmpDao;

@RestController
public class EmpCon {
	
	@Autowired
	EmpDao emp;
	
	
	@RequestMapping("/getall")
	public List<Emp> getEmp(){
		return emp.getall();
		
	}

}

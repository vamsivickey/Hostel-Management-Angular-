package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.Dep;
import com.example.registration.entity.Emp;
import com.example.registration.repository.EmpRep;

@Service
public class EmpDao {
	
	@Autowired
	EmpRep dmp;
	
	public List<Emp> getall(){
		return dmp.findAll();
	}
	
	public Emp reg(Emp s){
		return dmp.save(s);
	}

}

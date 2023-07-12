package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.Dep;
import com.example.registration.entity.HostelReg;
import com.example.registration.repository.DepRep;

@Service
public class DepDao {
	
	@Autowired
	DepRep dmp;
	
	public List<Dep> getall(){
		return dmp.findAll();
	}
	
	public Dep reg(Dep s){
		return dmp.save(s);
	}
	public Dep GetHostelById(int empId) {
		return dmp.findById(empId).orElse(null);
	}
	
}

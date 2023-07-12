package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.HostelReg;
import com.example.registration.repository.HostelRespository;

@Service
public class HostelDao {

	@Autowired
	HostelRespository hostelRespository;
	
	public List<HostelReg> getAllHostels() {
		return hostelRespository.findAll();
	}
	
	public HostelReg GetHostelById(int empId) {
		return hostelRespository.findById(empId).orElse(null);
	}
	
	
	
	public HostelReg registerHostel(HostelReg employee) {
		return hostelRespository.save(employee);
	}
	
	public HostelReg updateHostel(HostelReg employee) {
		return hostelRespository.save(employee);
	}
	
	public void deleteHostel(int empId) {
		hostelRespository.deleteById(empId);
	}
}

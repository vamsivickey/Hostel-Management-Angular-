package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.Dep;
import com.example.registration.entity.HostelReg;
import com.example.registration.service.DepDao;

@RestController
public class DepCon {
	
	@Autowired
	DepDao emp;
	
	
	@RequestMapping("/getAllDep")
	public List<Dep> getAllHostelss() {
		return emp.getall();
	}
	@PostMapping("/regDep")
	public String regHostels(@RequestBody Dep dept) {
		emp.reg(dept);
		return "Hostels Updated Successfully";
	}

	@GetMapping("/getDepById/{deptId}")
	public Dep getHostelsById(@PathVariable("deptId") int deptId) {
		Dep dept = emp.GetHostelById(deptId);
		
		if (dept != null)
			return dept;
		
//		return new HostelReg(0, "Hostels Not Found!!!", "");
		return null;
	}

}

package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.BookingDetails;
import com.example.registration.entity.HostelReg;
import com.example.registration.service.HostelDao;

@RestController
public class HostelController {
                                             
	@Autowired
	HostelDao HstDao;
	
	public static String uploadDirectory=System.getProperty("user.dir")+"/src/main/webapp/imagedata";
	
	
	@RequestMapping("/getAllHostels")
	public List<HostelReg> getAllHostelss() {
		return HstDao.getAllHostels();
	}
	
	@GetMapping("/getHostelsById/{deptId}")
	public HostelReg getHostelsById(@PathVariable("deptId") int deptId) {
		HostelReg dept = HstDao.GetHostelById(deptId);
		
		if (dept != null)
			return dept;
		
//		return new HostelReg(0, "Hostels Not Found!!!", "");
		return null;
	}
	

	@PostMapping("/regHostel")
	public String regHostels(@RequestBody HostelReg dept) {
		HstDao.updateHostel(dept);
		return "Hostels Updated Successfully";
	}
	

	
	@PutMapping("/updateHostels")
	public String updateHostels(@RequestBody HostelReg dept) {
		HstDao.updateHostel(dept);
		return "Hostels Updated Successfully";
	}
	
	@DeleteMapping("/deleteHostels/{deptId}")
	public String deleteHostels(@PathVariable("deptId") int deptId) {
		HstDao.deleteHostel(deptId);
		return "Hostels " + deptId + " Deleted Successfully!!!";
	}
	
	
	

	
	
	
	

	
	@PostMapping("/registerHostels")
	public String registerDepartment(@RequestBody HostelReg dept) {
		HstDao.registerHostel(dept);
		return "BookingDetails Registered Successfully";
	}
		
	}
	


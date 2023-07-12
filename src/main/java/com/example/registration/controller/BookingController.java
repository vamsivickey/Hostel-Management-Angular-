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
import com.example.registration.service.BookingDao;

@RestController
public class BookingController {

	@Autowired
	BookingDao custDao;
	
	@RequestMapping("/getAllBookingDetails")
	public List<BookingDetails> getAllDepartments() {
		return custDao.getAllBookingDetails();
	}
	
	@GetMapping("/getBookingDetailsById/{deptId}")
	public BookingDetails getDepartmentById(@PathVariable("deptId") int deptId) {
		BookingDetails dept = custDao.GetBookingDetailsById(deptId);
		
		if (dept != null)
			return dept;
		
		return new BookingDetails();
	}
	

	
	
	@PostMapping("/registerBookingDetails")
	public String registerDepartment(@RequestBody BookingDetails dept) {
		custDao.registerBookingDetails(dept);
		return "BookingDetails Registered Successfully";
	}
	
	@PutMapping("/updateBookingDetails")
	public String updateDepartment(@RequestBody BookingDetails dept) {
		custDao.updateBookingDetails(dept);
		return "BookingDetails Updated Successfully";
	}
	
	@DeleteMapping("/deleteBookingDetails/{deptId}")
	public String deleteDepartment(@PathVariable("deptId") int deptId) {
		custDao.deleteBookingDetails(deptId);
		return "BookingDetails " + deptId + " Deleted Successfully!!!";
	}
	
	@GetMapping("/getDepartmentByemail/{email}")
	public List<BookingDetails> getDepartmentByName(@PathVariable("email") String email) {
	return  custDao.getDepartmentByName(email);
		
	}
}

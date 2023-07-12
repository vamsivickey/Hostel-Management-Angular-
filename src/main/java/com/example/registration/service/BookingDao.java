package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.BookingDetails;
import com.example.registration.repository.BookingRespository;

@Service
public class BookingDao {

	@Autowired
	BookingRespository hostelRespository;
	
	public List<BookingDetails> getAllBookingDetails() {
		return hostelRespository.findAll();
	}
	
	public BookingDetails GetBookingDetailsById(int empId) {
		return hostelRespository.findById(empId).orElse(null);
	}
	
	
	
	public BookingDetails registerBookingDetails(BookingDetails employee) {
		return hostelRespository.save(employee);
	}
	
	public BookingDetails updateBookingDetails(BookingDetails employee) {
		return hostelRespository.save(employee);
	}
	
	public void deleteBookingDetails(int empId) {
		hostelRespository.deleteById(empId);
	}
	public List<BookingDetails> getDepartmentByName(String email) {
		return hostelRespository.findByName(email);
	}
	
}

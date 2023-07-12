package com.example.registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.BookingDetails;

@Repository
public interface BookingRespository extends JpaRepository<BookingDetails, Integer>{
	
	@Query(" from BookingDetails  where email = :email")
	List<BookingDetails> findByName(@Param("email") String email);
	

}

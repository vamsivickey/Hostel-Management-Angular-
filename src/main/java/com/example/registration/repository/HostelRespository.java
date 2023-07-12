package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.HostelReg;



@Repository
public interface HostelRespository extends JpaRepository<HostelReg, Integer>{
	
	
	

}

package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.Emp;

@Repository
public interface EmpRep extends JpaRepository<Emp, Integer> {

}

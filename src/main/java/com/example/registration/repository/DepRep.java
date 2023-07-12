package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.Dep;


@Repository
public interface DepRep extends JpaRepository<Dep, Integer> {

}

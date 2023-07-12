package com.example.registration.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class Dep {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dId;
	
	private String dName;
	
	@JsonIgnore
	@OneToMany(mappedBy="department")
	List<Emp> empList = new ArrayList<Emp>();

	public Dep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dep(int dId, String dName, List<Emp> empList) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.empList = empList;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Dep [dId=" + dId + ", dName=" + dName + ", empList=" + empList + "]";
	}
	
	
	

}

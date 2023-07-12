package com.example.registration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity	
public class Emp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eId;
	
	private String eName;
	
	@ManyToOne
	@JoinColumn(name="dId")
	Dep department;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eId, String eName, Dep department) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.department = department;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Dep getDepartment() {
		return department;
	}

	public void setDepartment(Dep department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", department=" + department + "]";
	}
	
	

}

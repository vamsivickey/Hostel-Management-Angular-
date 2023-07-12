package com.example.registration.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class HostelReg {
	
	@Id
	@GeneratedValue
	private int hst_Id;
	private String hst_name;
	private String owner_nam;
	private String emailId;
	private long hst_num;

	private String area;
	
	
	
	public HostelReg() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HostelReg(int hst_Id, String hst_name, String owner_nam, String emailId, long hst_num, String area) {
		super();
		this.hst_Id = hst_Id;
		this.hst_name = hst_name;
		this.owner_nam = owner_nam;
		this.emailId = emailId;
		this.hst_num = hst_num;
		this.area = area;
	}



	public int getHst_Id() {
		return hst_Id;
	}



	public void setHst_Id(int hst_Id) {
		this.hst_Id = hst_Id;
	}



	public String getHst_name() {
		return hst_name;
	}



	public void setHst_name(String hst_name) {
		this.hst_name = hst_name;
	}



	public String getOwner_nam() {
		return owner_nam;
	}



	public void setOwner_nam(String owner_nam) {
		this.owner_nam = owner_nam;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public long getHst_num() {
		return hst_num;
	}



	public void setHst_num(long hst_num) {
		this.hst_num = hst_num;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	@Override
	public String toString() {
		return "HostelReg [hst_Id=" + hst_Id + ", hst_name=" + hst_name + ", owner_nam=" + owner_nam + ", emailId="
				+ emailId + ", hst_num=" + hst_num + ", area=" + area + "]";
	}




}
package com.example.registration.entity;





import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BookingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomid;
	private String userName;
	private String email;
	private String city;
	private String price;
	private String state;
	private String date;
	
	
	@Temporal (TemporalType.TIMESTAMP)
	@Column(nullable = false) 
	private Date time;

	@PrePersist

	private void onCreate() { 
		time = new Date();

	}
	
	private int zipCode;
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(int roomid, String userName, String email, String city, String price, String state,
			String date, Date time, int zipCode) {
		super();
		this.roomid = roomid;
		this.userName = userName;
		this.email = email;
		this.city = city;
		this.price = price;
		this.state = state;
		this.date = date;
		this.time = time;
		this.zipCode = zipCode;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "BookingDetails [roomid=" + roomid + ", userName=" + userName + ", email=" + email + ", city=" + city
				+ ", price=" + price + ", state=" + state + ", date=" + date + ", time=" + time + ", zipCode=" + zipCode
				+ "]";
	}
	
}

package com.grill.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Renter")
public class Renter {
	
	 @Id
	   @Column(name="renterId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
int renterId;
	 
	 @Column(name="renterName")
    String renterName;
	 
	 @Column(name="phoneNumber")
    int phoneNumber;
	 
	 @Column(name="mailId")
	 String mailId;
	 
	 @Column(name="password")
	 String password;
	 
public int getRenterId() {
	return renterId;
}
public void setRenterId(int renterId) {
	this.renterId = renterId;
}
public String getRenterName() {
	return renterName;
}
public void setRenterName(String renterName) {
	this.renterName = renterName;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}

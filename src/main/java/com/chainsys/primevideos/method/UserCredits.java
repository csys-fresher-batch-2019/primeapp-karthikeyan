package com.chainsys.primevideos.method;

import java.sql.Date;
import java.time.LocalDate;

public class UserCredits {
	public String customerName;
	public String gender;
	public LocalDate dob;
	public int age;
	public String mailId;
	public int userId;
	public String password;
	public Long mobileNumber;
	public LocalDate createdDate;
	
	
	public UserCredits(String customerName, String gender, LocalDate dob, int age, String mailId, int userId,
			String password, Long mobileNumber, LocalDate createdDate) {
		super();
		this.customerName = customerName;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.mailId = mailId;
		this.userId = userId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.createdDate = createdDate;
		
		
	}


	public UserCredits() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Profile Details \n customerName=" + customerName + "\n gender=" + gender + "\n dob=" + dob + "\n age=" + age
				+ "\n mailId=" + mailId + "\n userId=" + userId + "\n password=" + password + "\n mobileNumber="
				+ mobileNumber + "\n createdDate=" + createdDate ;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	

}

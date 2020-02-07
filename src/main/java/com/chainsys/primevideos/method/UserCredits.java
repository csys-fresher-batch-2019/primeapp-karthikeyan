package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class UserCredits {
	private String customerName;
	private String gender;
	private LocalDate dob;
	private int age;
	private String mailId;
	private int userId;
	private String password;
	private Long mobileNumber;
	private LocalDate createdDate;
	
	
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
		throw new UnsupportedOperationException();
	}


	public String toString() {
		return "Profile Details \n customerName=" + customerName + "\n gender=" + gender + "\n dob=" + dob + "\n age=" + age
				+ "\n mailId=" + mailId + "\n userId=" + userId + "\n password=" + password + "\n mobileNumber="
				+ mobileNumber + "\n createdDate=" + createdDate ;
	}


	public void mailId1(String next) {
		throw new UnsupportedOperationException();
	}


	public void password1(String password2) {
		throw new UnsupportedOperationException();
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

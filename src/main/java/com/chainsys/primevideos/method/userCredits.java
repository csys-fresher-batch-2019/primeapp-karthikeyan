package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class userCredits {
	public String customerName;
	public String gender;
	public LocalDate dob;
	public int age;
	public String mailId;
	public int userId;
	public String password;
	public Long mobileNumber;
	public LocalDate createdDate;
	
	
	public userCredits(String customerName, String gender, LocalDate dob, int age, String mailId, int userId,
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


	public userCredits() {
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


	public void password(String password2) {
		throw new UnsupportedOperationException();
	}


	

}

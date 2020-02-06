package com.chainsys.primevideos.method;

//import java.sql.Date;
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


	public void MailId(String next) {
		// TODO Auto-generated method stub
		
	}


	public void Password(String password2) {
		// TODO Auto-generated method stub
		
	}


	

}

package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class paymentdetails {
	
	public int userId;
	public String password;
	public String cardCategory;
	public String nameOnCard;
	public Long cardNo;
	public LocalDate dateOfExpire;
	
	
	public paymentdetails(int userId, String password, String cardcategory, String nameOnCard, Long cardNo,
			LocalDate dateOfExpire) {
		super();
		this.userId = userId;
		this.password = password;
		this.cardCategory = cardcategory;
		this.nameOnCard = nameOnCard;
		this.cardNo = cardNo;
		this.dateOfExpire = dateOfExpire;
	}


	@Override
	public String toString() {
		return "paymentdetails [userId=" + userId + ", password=" + password + ", cardcategory=" + cardCategory
				+ ", nameOnCard=" + nameOnCard + ", cardNo=" + cardNo + ", dateOfExpire=" + dateOfExpire + "]";
	}
	
	
}

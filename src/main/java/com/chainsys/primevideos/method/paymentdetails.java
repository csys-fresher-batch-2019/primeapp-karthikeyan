package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class paymentdetails {
	
	private int userId;
	private String password;
	private String cardCategory;
	private String nameOnCard;
	private Long cardNo;
	private LocalDate dateOfExpire;
	
	
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


	public String getCardCategory() {
		return cardCategory;
	}


	public void setCardCategory(String cardCategory) {
		this.cardCategory = cardCategory;
	}


	public String getNameOnCard() {
		return nameOnCard;
	}


	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}


	public Long getCardNo() {
		return cardNo;
	}


	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}


	public LocalDate getDateOfExpire() {
		return dateOfExpire;
	}


	public void setDateOfExpire(LocalDate dateOfExpire) {
		this.dateOfExpire = dateOfExpire;
	}
	
	
}

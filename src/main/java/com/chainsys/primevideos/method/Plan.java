package com.chainsys.primevideos.method;

public class Plan {
	private int planId;
	private int planAmount; 
	private int planDuration; 
	private int noOfScreens;
	private int discountAmount=0;
	
	public Plan(int planId, int planAmount, int planDuration, int noOfScreens, int discountAmount) {
		super();
		this.planId = planId;
		this.planAmount = planAmount;
		this.planDuration = planDuration;
		this.noOfScreens = noOfScreens;
		this.discountAmount = discountAmount;
	}

	public Plan() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PlanId=" + planId + ", PlanAmount=" + planAmount + ", PlanDuration=" + planDuration
				+ ", NoOfScreens=" + noOfScreens + ", DiscountAmount=" + discountAmount ;
	}

	public static void add(Plan as) {
		// TODO Auto-generated method stub
		
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(int planAmount) {
		this.planAmount = planAmount;
	}

	public int getPlanDuration() {
		return planDuration;
	}

	public void setPlanDuration(int planDuration) {
		this.planDuration = planDuration;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	
	
}

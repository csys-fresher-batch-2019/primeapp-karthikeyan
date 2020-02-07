package com.chainsys.primevideos.method;

public class Plan {
	public int planId;
	public int planAmount; 
	public int planDuration; 
	public int noOfScreens;
	public int discountAmount=0;
	
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

}
package com.chainsys.primevideos.dao;

import java.util.ArrayList;

import com.chainsys.primevideos.method.Plan;

public interface AmazonPlanDAO {
	void addPlan(Plan plans) throws Exception;
	
	ArrayList<Plan> list() throws Exception;
	
	ArrayList<Integer> getPlanDuration(int planDuration) throws Exception;
	
	ArrayList<Plan> getPlansamount(int planAmount) throws Exception;
	
	ArrayList<Plan> getPlans(int planDuration,int planAmount);


}

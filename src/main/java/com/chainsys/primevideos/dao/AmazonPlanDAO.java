package com.chainsys.primevideos.dao;

import java.util.ArrayList;

import com.chainsys.primevideos.method.Plan;

public interface AmazonPlanDAO {
	void addPlan(Plan plans) throws Exception;
	
	void deletePlan(int planId) throws Exception;
	
	void updatePlan(Plan plans) throws Exception;
	
	ArrayList<Plan> list() throws Exception;
	
	ArrayList<Integer> getPlanDuration(int planDuration) throws Exception;
	
	


}

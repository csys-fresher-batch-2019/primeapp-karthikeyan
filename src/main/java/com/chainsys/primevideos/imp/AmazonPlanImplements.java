package com.chainsys.primevideos.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.chainsys.primevideos.dao.AmazonPlanDAO;
import com.chainsys.primevideos.method.Plan;

import connection.TestConnection;
import exception.DbException;
import logger.Logger;
public class AmazonPlanImplements implements AmazonPlanDAO {
	Logger logger = Logger.getInstance();

	public void addPlan(Plan plans) throws Exception {
		String sql = "insert into plans(plan_id,plan_amount,plan_duration,no_of_screens) values ("+plans.planId+","+plans.planAmount+","+plans.planDuration+","+plans.discountAmount+")";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);)
		{
		int row = pst.executeUpdate();
		logger.info(row);}
		catch(DbException e)
		{
			throw new Exception("Plan Insertion Failed");
		}
		
	} 

	public ArrayList<Plan> list() throws Exception{
		String sql = "select * from plans";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		try(ResultSet rs = pst.executeQuery();){
		ArrayList<Plan> ll = new ArrayList<>();
		
		while(rs.next())
		{
			int a=rs.getInt(1);
			int b=rs.getInt(2);
			int c=rs.getInt(3);
			int d=rs.getInt(4);
			int e=rs.getInt(5);
			
			Plan as = new Plan();
			as.planId=a;
			as.planAmount=b;
			as.planDuration=c;
			as.noOfScreens=d;
			as.discountAmount=e;
			
			ll.add(as);
		
		}
		return ll;
		}}
		catch(DbException e)
		{
			throw new Exception("Plan Selection View Failed");
		}
		
	
	}
	
	public ArrayList<Integer> getPlanDuration(int planDuration) throws Exception{
		String sql = "select * from plans where plan_duration >= ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setInt(1,planDuration);
		try(ResultSet rs = pst.executeQuery();){
		logger.info(rs);
		ArrayList<Integer> ln = new ArrayList<>();
		
		while(rs.next())
		{
			int a=rs.getInt(1);
			
			Plan as = new Plan();
			as.planId=a;			
			
		}			
		return ln;	
		}}
		catch(DbException e)
		{
			throw new Exception("PlanView Failed");
		}
		
		
	}

	public ArrayList<Plan> getPlansamount(int planAmount) throws Exception {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Plan> getPlans(int planDuration, int planAmount) {
		throw new UnsupportedOperationException();
	}
		
			
}	
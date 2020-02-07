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
		String sql = "insert into plans(plan_id,plan_amount,plan_duration,no_of_screens,discount_amount) values (?,?,?,?,?)";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);)
		{
		pst.setInt(1, plans.getPlanId());
		pst.setInt(2, plans.getPlanAmount());
		pst.setInt(3, plans.getPlanDuration());
		pst.setInt(4, plans.getNoOfScreens());
		pst.setInt(5, plans.getDiscountAmount());
		int row = pst.executeUpdate();
		if(row==1)
		{
		logger.info("PlanId :"+plans.getPlanId()+" Inserted\n");
		}}
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
			as.setPlanId(a);
			as.setPlanAmount(b);
			as.setPlanDuration(c);
			as.setNoOfScreens(d);
			as.setDiscountAmount(e);
			
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
			as.setPlanId(a);			
			
		}			
		return ln;	
		}}
		catch(DbException e)
		{
			throw new Exception("PlanView Failed");
		}
		
		
	}

	@Override
	public void deletePlan(int planId) throws Exception {
		String sql = "delete plans where plan_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);)
		{
			pst.setInt(1, planId);
			int row = pst.executeUpdate();
			if(row==1)
			{
			logger.info("PlanId :"+planId+" deleted \n");
			}}
		catch(DbException e)
		{
			throw new Exception("Plan deletion Failed");
		}
	}
	@Override
	public void updatePlan(Plan plans) throws Exception {
		String sql = "update plans set plan_amount = ?, plan_duration = ?,no_of_screens = ?,discount_amount=? where plan_id =?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);)
		{
			pst.setInt(1, plans.getPlanAmount());
			pst.setInt(2, plans.getPlanDuration());
			pst.setInt(3, plans.getNoOfScreens());
			pst.setInt(4, plans.getDiscountAmount());
			pst.setInt(5, plans.getPlanId());
			int row = pst.executeUpdate();
			if(row==1)
			{
			logger.info("PlanId :"+plans.getPlanId()+" Updated\n");
			}}
		catch(DbException e)
		{
			throw new Exception("Plan Insertion Failed");
		}
		
	} 
		
	}
package com.chainsys.primevideos.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.chainsys.primevideos.dao.UserCreditsDAO;
import com.chainsys.primevideos.method.UserCredits;

import connection.TestConnection;
import exception.DbException;
import logger.Logger;
import util.OTPUtil;
import util.TestConformEmail;


public class UserCreditsImp implements UserCreditsDAO {
	Logger logger = Logger.getInstance();
	public boolean userLogin(String mailID) throws Exception {
		String sql = "Select passwords from user_credits where mail_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, mailID);
		try(ResultSet rs = pst.executeQuery();){
		if (rs.next()) {
			return true;
		} else {
			logger.info("Incorrect Email ID DoesNot Exist");
			return false;
		}}}
		catch(DbException e)
		{
			throw new Exception("UserLogin Failed");
		}

	}

	public boolean resetPassword(String mailId) throws Exception {
		int otp = 0;
		String sql = "select * from user_credits where mail_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, mailId);
		try(ResultSet rs = pst.executeQuery();){
		if (rs.next()) {
			otp = OTPUtil.getOTP();
			TestConformEmail.changePassword(otp, mailId);
			return true;
		}
		}}
		catch(DbException e)
		{
			throw new Exception("User Selection Reset Password Failed");
		}
		return false;
		
		
	}

	
	public void verifyOTPAndUpdatePassword(String mailId, String password) throws Exception {
		// String password = getPassword.main(null);
		String sql1 = "update user_credits set passwords = '" + password + "'where mail_id = ?"; //and otp = ?
		try(Connection con1 = TestConnection.getConnection();
		PreparedStatement pst1 = con1.prepareStatement(sql1);){
		pst1.setString(1, mailId);
		int row = pst1.executeUpdate();
		if (row == 1) {
			logger.info("Password Updated");
		}}
		catch(DbException e)
		{
			throw new Exception("Password Update Failed");
		}

		

	}

	public String userSignUp(UserCredits user) throws Exception {
		String sql = "select user_id from user_credits where mail_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, user.mailId);
		try(ResultSet rs = pst.executeQuery();){
		rs.next();
		if (rs.next()) {
			logger.info("Email Id Already Exist");

		} else {
			int random = OTPUtil.getOTP();
			insertSignUp(user.mailId, user.password, random);
			return user.mailId;

		}
		return null;}}
		catch(DbException e)
		{
			throw new Exception("userLogin operation Failed");
		}

	}

	public void insertSignUp(String mailId, String password, int random) throws Exception {

		if (TestConformEmail.main(random, mailId))

		{
			String sql1 = "insert into user_credits (mail_id,user_id,passwords) values (?,user_id_seq.nextval,?)";
			try(Connection con1 = TestConnection.getConnection();
			PreparedStatement pst1 = con1.prepareStatement(sql1);){
			pst1.setString(1, mailId);
			pst1.setString(2, password);
			pst1.executeUpdate();

			logger.info("Welcome to Prime\nUpdate your Profile");
			}
		catch(DbException e)
			{
				throw new Exception("Update User Failed After Otp Conformation");
			}
			
		}
	}

	public String password(String mailId) throws Exception {
		String sql = "Select passwords from user_credits where mail_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, mailId);
		try(ResultSet rs = pst.executeQuery();){
		rs.next();
		
		return rs.getString(1);		
		}
		}
		catch(DbException e)
		{
			throw new Exception("Password Selection Failed at Matching Region");
		}

	}

	public void userUpdate(UserCredits users) throws Exception {
		
			String sql = "update user_credits set customer_name = ? ,gender = ?,DOB = ?,age = ?,mobile_no = ? where mail_id = ?";
			try(Connection con = TestConnection.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);){
			pst.setString(1, users.customerName);
			pst.setString(2, users.gender);
			pst.setDate(3, Date.valueOf(users.dob));
			pst.setInt(4, users.age);
			pst.setLong(5, users.mobileNumber);
			pst.setString(6, users.mailId);
			int row = pst.executeUpdate();

			if (row != 0) {
				profile(users.mailId);
			}
		} catch(DbException e)
		{
			throw new Exception("UserProfile Update Failed");
		}
	}

	public void profile(String mailIds) throws Exception {
		String sql1 = "select * from user_credits where mail_id = ?";
		try(Connection con1 = TestConnection.getConnection();
		PreparedStatement pst1 = con1.prepareStatement(sql1);){
		
		pst1.setString(1, mailIds);
		try(ResultSet row1 = pst1.executeQuery();){
		row1.next();
		String a = row1.getString(1);
		String b = row1.getString(2);
		Date c = row1.getDate(3);
		int d = row1.getInt(4);
		String e = row1.getString(5);
		int f = row1.getInt(6);
		String g = row1.getString(7);
		Long h = row1.getLong(8);
		Date i = row1.getDate(9);
		UserCredits aes = new UserCredits();
		aes.customerName = a;
		aes.gender = b;
		aes.dob = c.toLocalDate();
		aes.age = d;
		aes.mailId = e;
		aes.userId = f;
		aes.password = g;
		aes.mobileNumber = h;
		aes.createdDate = i.toLocalDate();
		logger.info(aes);
		logger.info("Profile Updated");
		}}
		catch(DbException e)
		{
			throw new Exception("UsesCredits View Failed");
		}
	}

	public List<UserCredits> getUserDetails() {
		throw new UnsupportedOperationException();
	}

	public List<UserCredits> getUserAge(int age) {
		throw new UnsupportedOperationException();
	}

}

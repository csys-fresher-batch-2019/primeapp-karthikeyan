package com.chainsys.primevideos.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.chainsys.primevideos.dao.usercreditsdao;
import com.chainsys.primevideos.method.UserCredits;

import Connection.TestConnection;
import Exception.DbException;
import Util.OTPUtil;
import Util.TestConformEmail;
import logger.Logger;


public class UserCreditsImp implements usercreditsdao {
	Logger logger = Logger.getInstance();
	public boolean userLogin(String mailID) throws Exception {
		String sql = "Select passwords from user_credits where mail_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, mailID);
		try(ResultSet rs = pst.executeQuery();){
		if (rs.next()) {
			con.close();
			return true;
		} else {
			logger.info("Incorrect Email ID DoesNot Exist");
			con.close();
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
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			otp = OTPUtil.getOTP();
			TestConformEmail.changePassword(otp, mailId);
			return true;
		}
		}
		catch(DbException e)
		{
			throw new Exception("User Selection Reset Password Failed");
		}
		return false;
		
		
	}

	
	public void verifyOTPAndUpdatePassword(String mailId, String password) throws Exception {
		// String password = getPassword.main(null);
		String sql1 = "update user_credits set passwords = '" + password + "'where mail_id = ?"; //and otp = ?
		Connection con1 = TestConnection.getConnection();
		PreparedStatement pst1 = con1.prepareStatement(sql1);
		pst1.setString(1, mailId);
		int row = pst1.executeUpdate();
		if (row == 1) {
			logger.info("Password Updated");
			con1.close();

		}

	}

	public String userSignUp(UserCredits User) throws Exception {
		String sql = "select user_id from user_credits where mail_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, User.mailId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		if (rs.next()) {
			con.close();
			logger.info("Email Id Already Exist");

		} else {
			int random = OTPUtil.getOTP();
			con.close();
			insertSignUp(User.mailId, User.password, random);
			return User.mailId;

		}
		return null;

	}

	public void insertSignUp(String mailId, String password, int random) throws Exception {

		if (TestConformEmail.main(random, mailId))

		{
			String sql1 = "insert into user_credits (mail_id,user_id,passwords) values (?,user_id_seq.nextval,?)";
			Connection con1 = TestConnection.getConnection();
			PreparedStatement pst1 = con1.prepareStatement(sql1);
			pst1.setString(1, mailId);
			pst1.setString(2, password);
			pst1.executeUpdate();

			logger.info("Welcome to Prime\nUpdate your Profile");
			con1.close();
			
		}
	}

	public String Password(String mailId) throws Exception {
		String sql = "Select passwords from user_credits where mail_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, mailId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String a = rs.getString(1);
		con.close();
		return a;

	}

	public void userUpdate(UserCredits users) throws Exception {
		try {
			String sql = "update user_credits set customer_name = ? ,gender = ?,DOB = ?,age = ?,mobile_no = ? where mail_id = ?";
			Connection con = TestConnection.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, users.customerName);
			pst.setString(2, users.gender);
			pst.setDate(3, Date.valueOf(users.dob));
			pst.setInt(4, users.age);
			pst.setLong(5, users.mobileNumber);
			pst.setString(6, users.mailId);
			int row = pst.executeUpdate();

			con.close();
			if (row != 0) {
				profile(users.mailId);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	public void profile(String mailIds) throws Exception {
		String sql1 = "select * from user_credits where mail_id = ?";
		Connection con1 = TestConnection.getConnection();
		PreparedStatement pst1 = con1.prepareStatement(sql1);
		Logger logger = Logger.getInstance();
		pst1.setString(1, mailIds);
		ResultSet row1 = pst1.executeQuery();
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
		con1.close();
	}

	public List<UserCredits> getUserDetails() {
		return null;
	}

	public List<UserCredits> getUserAge(int age) {
		return null;
	}

}

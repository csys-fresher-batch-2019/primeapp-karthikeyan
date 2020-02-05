package usercredits;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.chainsys.primeapp.OTPUtil;

import Connection.TestConnection;
import com.chainsys.primeapp.TestConformEmail;
import TestUserCredits.TestLogin;
import TestUserCredits.TestNewUser;
import TestUserCredits.TestRandomNumber;
import TestUserCredits.getPassword;

public class UserCreditsImp implements usercreditsdao{

	public boolean userLogin(String mailID) throws Exception
	{
		String sql = "Select passwords from user_credits where mail_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		pst.setString(1, mailID);
		ResultSet rs = pst.executeQuery();
		if (rs.next())
		{
			con.close();
		return true;
		}
		else
		{
			System.out.println("Incorrect Email ID DoesNot Exist");
			return false;
		}
		
	
	}
	public void testPassword(String mailId) throws Exception{
		String sql = "select * from user_credits where mail_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		pst.setString(1, mailId);
		ResultSet rs = pst.executeQuery();
		if (rs.next()){
			int random = TestRandomNumber.main(null);
			if(TestConformEmail.changePassword(random,mailId))
			{
				String password = getPassword.main(null);
				String sql1 = "update user_credits set passwords = '"+password+"'where mail_id = ?";
				Connection con1 = TestConnection.getConnection();
				PreparedStatement pst1 = con1.prepareStatement(sql1);
				pst1.setString(1, mailId);
				int row = pst1.executeUpdate();
				if(row  ==1 )
				{
					System.out.println("Password Updated");
					TestLogin.main(null);
				}
			}
		}
	}

	public void userSignUp(UserCredits User) throws Exception {
		String sql = "select user_id from user_credits where mail_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		pst.setString(1, User.mailId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		if (rs.next()){
			con.close();
			System.out.println("Email Id Already Exist");
			
		}
		else {
			int random = OTPUtil.getOTP();
			insertSignUp(User.mailId,User.password,random);
			
			
		}
		
	}
	
		
	public void insertSignUp(String mailId, String password,int random) throws Exception
		{
			
			if(TestConformEmail.main(random,mailId))
		
			{
			
			String sql1 = "insert into user_credits (mail_id,user_id,passwords) values (?,user_id_seq.nextval,?)";
			Connection con1 = TestConnection.getConnection();
			PreparedStatement pst1 = con1.prepareStatement(sql1);
			pst1.setString(1, mailId);
			pst1.setString(2,password);
			pst1.executeUpdate();	
			
			System.out.println("Welcome to Prime\nUpdate your Profile");
			con1.close();
			TestNewUser.main(mailId);
			}
		}
	
	public String Password (String mailId) throws Exception
	{
		String sql = "Select passwords from user_credits where mail_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		pst.setString(1, mailId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String a =rs.getString(1);
		con.close();
		return a;
	
	}


	public void userUpdate(UserCredits users) throws Exception {
		String sql = "update user_credits set customer_name = ? ,gender = ?,DOB = ?,age = ?,mobile_no = ? where mail_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,users.customerName);
		pst.setString(2,users.gender);
		pst.setDate(3, Date.valueOf(users.dob));
		pst.setInt(4,users.age);
		pst.setLong(5, users.mobileNumber);
		pst.setString(6, users.mailId);
		int row = pst.executeUpdate();
		
		con.close();
		/*if (row != 0) {
			profile(users.mailId);
		}*/
	}
	public void profile(String mailIds) throws Exception
	{
		String sql1 = "select * from user_credits where mail_id = ?";
		Connection con1 = TestConnection.getConnection();
		PreparedStatement pst1 = con1.prepareStatement(sql1);

		pst1.setString(1,mailIds);	
		ResultSet row1 = pst1.executeQuery();
		row1.next();
		String a=row1.getString(1);
		String b= row1.getString(2);
		Date c = row1.getDate(3);
		int d=row1.getInt(4);
		String e=row1.getString(5);
		int f= row1.getInt(6);
		String g=row1.getString(7);
		Long h = row1.getLong(8);
		Date i =row1.getDate(9);
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
		System.out.println(aes);
		
	
		System.out.println("Profile Updated");
		con1.close();
	}

	private Object getDate(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<UserCredits> getUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserCredits> getUserAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

}

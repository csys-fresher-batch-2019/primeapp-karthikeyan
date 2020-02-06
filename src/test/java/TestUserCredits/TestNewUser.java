package TestUserCredits;

import java.time.LocalDate;
import java.util.Scanner;

import com.chainsys.primevideos.imp.UserCreditsImp;
import com.chainsys.primevideos.method.UserCredits;

import logger.Logger;

public class TestNewUser {
	//update user_credits set((customer_name,gender,DOB,age,mail_id,passwords,mobile_no) where mail_id = ?;
	public static void main(String mailIds) throws Exception {
		UserCreditsImp apa = new UserCreditsImp();
		UserCredits asa = new UserCredits();
		asa.mailId=mailIds;
		Logger logger = Logger.getInstance();
	    Scanner sc = new Scanner(System.in);
	 	logger.info("Enter CustomerName");
	 	asa.customerName=sc.next();
	 	System.out.println("Enter Gender(M/F)");
	 	asa.gender=sc.next();
	 	System.out.println("Enter DOB(yyyy-mm-dd)");
	 	String dates =sc.next();
	 	LocalDate dobs = LocalDate.parse(dates);
	 	asa.dob=dobs;
	 	System.out.println("Enter Age");
	 	asa.age=sc.nextInt();
	 	System.out.println("Enter MobileNo");
	 	asa.mobileNumber=sc.nextLong();
	 	apa.userUpdate(asa);
	 	
	 	
	}

}

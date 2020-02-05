	package TestUserCredits;

import java.util.Scanner;

import usercredits.UserCredits;
import usercredits.UserCreditsImp;

public class TestSignUp {

	public static void main(String[] args) throws Exception {
		UserCreditsImp ap = new UserCreditsImp();
		UserCredits as = new UserCredits();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Prime Registration");
	    System.out.println("Mail ID");   
	 	as.mailId = sc.next();
	 	
	 	String password="";
	 	while((password.length())<8)
	 	{	
	 		System.out.println("Password(Must contain 8 characters)");
		 	password =sc.next();
	 	}
	 	System.out.println("Re-Enter Password");
	 	String password1  =sc.next();
	 	if (password1.equals(password))
	 	{
	 		as.password = password;
	 		ap.userSignUp(as);
	 		
	 	}
	 	else
	 	{
	 		
	 		System.out.println("Pasword does not match");
	 	}
	 	
		

}

}

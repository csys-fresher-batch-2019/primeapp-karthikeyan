package TestUserCredits;

import java.util.Scanner;

import usercredits.UserCredits;
import usercredits.UserCreditsImp;

public class getPassword {

	public static String main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UserCreditsImp ap = new UserCreditsImp();
		UserCredits as = new UserCredits();
		String password="";
	 	while((password.length())<8)
	 	{	
	 		System.out.println("Password(Must contain more than 8 characters)");
		 	password =sc.next();
	 	}
	 	System.out.println("Re-Enter Password");
	 	String password1  =sc.next();
	 	if (password1.equals(password))
	 	{
	 		return password;	 		
	 	}
	 	else
	 	{
	 		
	 		System.out.println("Pasword does not match");
	 	}
		return null;
	}

}

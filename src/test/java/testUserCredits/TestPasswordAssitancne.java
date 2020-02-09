package testUserCredits;

import java.util.Scanner;

import com.chainsys.primevideos.imp.UserCreditsImp;

public class TestPasswordAssitancne {

	public static void main(String[] args) throws Exception {
		UserCreditsImp s = new UserCreditsImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Prime Password assistance\n\nEnter the email address associated with your \nPrime account.");
		System.out.println("Enter your Email ID : ");
		String EmailId = sc.next();
		

		

		if (s.resetPassword(EmailId)) {
			String password="";
			String password1="";
			String password2="";
		 	while((password.length())<8)
		 	{	
		 		System.out.println("Password(Must contain more than 8 characters)");
			 	password =sc.next();
		 	}
		 	System.out.println("Re-Enter Password");
		 	password1  =sc.next();
		 	if (password1.equals(password))
		 	{
		 		password2=password;	 		
		 	}
		 	else
		 	{
		 		
		 		System.out.println("Password does not match");
		 	}
			s.verifyOTPAndUpdatePassword(EmailId, password2);
		}
		sc.close();

	}

}

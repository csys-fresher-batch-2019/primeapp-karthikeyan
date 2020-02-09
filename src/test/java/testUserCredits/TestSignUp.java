	package testUserCredits;

import java.util.Scanner;

import com.chainsys.primevideos.imp.UserCreditsImp;

public class TestSignUp {
	 static Scanner sc = new Scanner(System.in);
	public static boolean main(String[] args) throws Exception {
		UserCreditsImp ap = new UserCreditsImp();
	   
	    System.out.println("Prime Registration");
	    System.out.println("Mail ID");
	    String mailId = sc.next();
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
	 		if(ap.userSignUp(mailId,password))
	 		{
	 		TestNewUser.main(mailId);
	 		}
	 		else
	 		{
	 			nextStep();
	 		}
	 	}
	 	else
	 	{
	 		
	 		System.out.println("Pasword does not match");
	 		nextStep();
	 	}
	 	sc.close();
		return false;
		

}

	private static void nextStep() throws Exception {
		System.out.println("Press 1 SignUp again");
		System.out.println("Press 2 to go to userInterface");
		int a =sc.nextInt();
		switch(a)
		{
		case 1:
		{
			TestSignUp.main(null);
		}
		case 2:
		{
			TestUserInterface.main(null);
		}
		}
	}

}

package TestUserCredits;

import java.util.Scanner;

import usercredits.UserCreditsImp;

public class TestPasswordAssitancne {

	public static void main(String[] args) throws Exception {
		UserCreditsImp s = new UserCreditsImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Prime Password assistance\n\nEnter the email address associated with your \nPrime account.");
		System.out.println("Enter your Email ID : ");
		String EmailId = sc.next();		
		s.testPassword(EmailId);
	}

}

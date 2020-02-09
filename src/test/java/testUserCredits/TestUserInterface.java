package testUserCredits;

import java.util.Scanner;

import plan.TestPlan;
import testUserCredits.TestLogin;
import testUserCredits.TestSignUp;

public class TestUserInterface {

	public static <ReadFiles> void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Prime Video");
		System.out.println("Join Prime to watch the latest movies, exclusive TV shows as well as award-winning Amazon Originals");
		System.out.println("Press 1 --- Login to Prime videos");
		System.out.println("Press 2 --- SignIn to Prime Video");
		System.out.println("Press 3 --- View Prime videos Plans");
		System.out.println("Press 4 --- About Prime videos");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
		{
			TestLogin.main(null);
			
		}
		case 2:
		{
			if(TestSignUp.main(null))
			{
			TestLogin.main(null);
			}
			
			break;
		}
		case 3:
		{	
			System.out.println("Amazon Prime Plan");
			TestPlan.main(null);
			goBack(sc);
			break;
		}
		case 4:
		{
			
			ReadFile.main("Amazonprime");
			goBack(sc);
			
			break;
		}
		default:
		{
			System.out.println("Enter Valid Number");
		}
		}
		
	}

	private static void goBack(Scanner sc) throws Exception {
		System.out.println("To Go Back Press 0");
		int s = sc.nextInt();
		if(s==0)
		{
			TestUserInterface.main(null);
		}
		sc.close();
	
	}
	

}

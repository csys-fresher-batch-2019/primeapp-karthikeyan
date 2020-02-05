package TestUserCredits;

import java.util.Scanner;

import TestUserCredits.TestLogin;
import TestUserCredits.TestSignUp;
import plan.TestPlan;

public class TestProject {

	public static <ReadFiles> void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ReadFile f = new ReadFile();
		System.out.println("Welcome to Prime Video");
		System.out.println("Join Prime to watch the latest movies, exclusive TV shows as well as award-winning Amazon Originals");
		System.out.println("Press 1 --- Login to Amazon Prime");
		System.out.println("Press 2 --- SignIn to Amazon Prime");
		System.out.println("Press 3 --- View Amazon Plans");
		System.out.println("Press 4 --- About Amazon Prime");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
		{
			TestLogin.main(null);
			
		}
		case 2:
		{
			TestSignUp.main(null);
			TestLogin.main(null);
			
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
			TestProject.main(null);
		}
	}

}

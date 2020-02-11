package testUserCredits;

import java.util.Scanner;

public class TestHelp {
	public static void main() throws Exception {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Prime Assitance");
		System.out.println("1. Go Back to Login ");
		System.out.println("2. Go Back to Home Page");
		System.out.println("3. To Change Password");
		int c =sc.nextInt();
		switch(c)
		{
		case 1:
		{
			TestLogin.main(null);
			break;
		}
		case 2:
		{
			TestUserInterface.main(null);
			break;
		}
		case 3:
		{
			TestPasswordAssitancne.main(null);
			break;
		}
		
	}

}
}

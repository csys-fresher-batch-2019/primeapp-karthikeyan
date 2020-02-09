package testUserCredits;

import java.util.Scanner;

import com.chainsys.primevideos.imp.UserCreditsImp;

import plan.TestPlan;

public class TestSetting {
	static Scanner sc = new Scanner(System.in);
	public static void main(String EmailId) throws Exception {
		UserCreditsImp as = new UserCreditsImp();
		System.out.println("Prime Video Settings");
		System.out.println("1. To View  All Plans");
		System.out.println("2. To View Your Profile");
		System.out.println("3. To Change Password");
		System.out.println("4. About");
		System.out.println("5. Log Out");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			TestPlan.main(null);
			break;
		}
		case 2:
		{
			as.profile(EmailId);
			break;
		}
		case 3:
		{
			TestPasswordAssitancne.main(null);
			break;
		}
		case 4:
		{
			ReadFile.main("Amazonprime");
			break;
			
		}
		case 5:
		{
			TestUserInterface.main(null);
			break;
		}
		}
		TestPage.main(EmailId);
		sc.close();
	}

}

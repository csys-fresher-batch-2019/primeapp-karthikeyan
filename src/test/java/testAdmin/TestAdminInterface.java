package testAdmin;

import java.util.Scanner;

public class TestAdminInterface {
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Admin Interface of Prime");
		System.out.println("Select Option For Required Field");
		System.out.println("1.Plans");
		System.out.println("2.Categorys");
		System.out.println("3.UserCredits");
		System.out.println("4.PrimeReleases");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			
			TestPlanInterface.main(null);
			break;
			
		}
		case 2:
		{
			TestCategoryInterface.main(null);
			break;
		}
		case 3:
		{
			TestUserAdminInterface.main(null);
			break;
		}
		}
		TestAdminInterface.main(null);


		
	}
	}


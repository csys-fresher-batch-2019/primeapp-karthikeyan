package testUserCredits;

import java.util.Scanner;

public class TestPage {
	

	public static void main(String EmailId) throws Exception {
		
		ReadFile.main("Page");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Page :");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			TestHome.main(EmailId);
			break;
		}
		case 2:
		{
			TestSearch.main(EmailId);
			break;
		}
		case 3:
		{
			break;
		}
		case 4:
		{
			break;
		}
		case 5:
		{
			TestSetting.main(EmailId);
			break;
		}
		default:
		{
			System.out.println("Enter valid Page");
		}
		
			
	}

	}}

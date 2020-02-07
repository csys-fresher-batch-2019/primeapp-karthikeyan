package testUserCredits;

import java.util.Scanner;

public class TestPage {
	

	public static void main(String[] args) throws Exception {
		
		ReadFile.main("Page");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Page :");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			TestHome.main(null);
			break;
		}
		case 2:
		{
			TestSearch.main(null);
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
			break;
		}
		default:
		{
			System.out.println("Enter valid Page");
		}
		
		sc.close();	
	}

	}}

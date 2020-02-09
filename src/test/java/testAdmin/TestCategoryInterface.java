package testAdmin;

import java.util.Scanner;

import testCategorys.TestDeleteCategorys;
import testCategorys.TestInsertCategorys;
import testCategorys.TestSelectCategorys;
import testCategorys.TestUpdateCategorys;

public class TestCategoryInterface {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
	
	System.out.println("Prime Videos Categorys");
	System.out.println("1.To Insert New Category");
	System.out.println("2.To View Categorys");
	System.out.println("3.To Delete A Category");
	System.out.println("4.To Update A Category");
	int choise1 = sc.nextInt();
	switch(choise1)
	{
	case 1:
	{
		TestInsertCategorys.main(null);
		break;
	}
	case 2:
	{
		TestSelectCategorys.main(null);
		break;
	}
	case 3:
	{
		TestDeleteCategorys.main(null);
		break;
	}	
	case 4:
	{
		TestUpdateCategorys.main(null);
		break;
	}
	}
	System.out.println("To Stay Press 1");
	System.out.println("To Go Back To AdminInterface Page Press 2");
	int ch = sc.nextInt();
	sc.close();
	switch(ch)
	{
	case 1:
	{
		TestCategoryInterface.main(null);
		break;
	}
	case 2:
	{
		TestAdminInterface.main(null);
		break;
	}
	}
}
}

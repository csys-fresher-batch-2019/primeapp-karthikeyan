package testAdmin;
import java.util.Scanner;

import plan.TestDeletePlan;
import plan.TestInsertPlan;
import plan.TestPlan;
import plan.TestUpdatePlan;

public class TestPlanInterface {
	

	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		System.out.println("Prime Videos Plans");
		System.out.println("1.To Insert New Plan");
		System.out.println("2.To View Plans");
		System.out.println("3.To Delete A Plan");
		System.out.println("4.To Update A PLan");
		int choise1 = sc.nextInt();
		switch(choise1)
		{
		case 1:
		{
			TestInsertPlan.main(null);
			break;
		}
		case 2:
		{
			TestPlan.main(null);
			break;
		}
		case 3:
		{
			TestDeletePlan.main(null);
			break;
		}
		
		case 4:
		{
			TestUpdatePlan.main(null);
			break;
		}
		}
		System.out.println("To Stay Press 1");
		System.out.println("To Go Back To AdminInterface Page Press 2");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			TestPlanInterface.main(null);
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


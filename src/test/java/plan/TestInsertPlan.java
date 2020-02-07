package plan;

import java.util.Scanner;

import com.chainsys.primevideos.imp.AmazonPlanImplements;
import com.chainsys.primevideos.method.Plan;

public class TestInsertPlan {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		AmazonPlanImplements api = new AmazonPlanImplements();
		Plan a = new Plan();
		System.out.println("Enter PlanId :");
		a.planId = sc.nextInt();
		System.out.println("Enter PlanDuration :");
		a.planDuration=sc.nextInt();
		System.out.println("Enter PlanAmount :");
		a.planAmount=sc.nextInt();
		System.out.println("Enter No Of Screens :");
		a.noOfScreens=sc.nextInt();
		System.out.println("Enter Discount Amount :");
		a.discountAmount=sc.nextInt();
		api.addPlan(a);
		sc.close();

	}

}

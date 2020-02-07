package plan;

import java.util.Scanner;

import com.chainsys.primevideos.imp.AmazonPlanImplements;

public class TestDeletePlan {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		AmazonPlanImplements api = new AmazonPlanImplements();
		System.out.println("Enter the Plan ID");
		int planId=sc.nextInt();
		api.deletePlan(planId);
	}

}

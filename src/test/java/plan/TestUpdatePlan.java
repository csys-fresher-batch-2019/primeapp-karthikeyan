package plan;

import java.util.Scanner;

import com.chainsys.primevideos.imp.AmazonPlanImplements;
import com.chainsys.primevideos.method.Plan;

public class TestUpdatePlan {

static Scanner sc= new Scanner(System.in);
		public static void main(String[] args) throws Exception {
			AmazonPlanImplements api = new AmazonPlanImplements();
			Plan a = new Plan();
			System.out.println("Enter PlanId To Update:");
			a.setPlanId(sc.nextInt());
			System.out.println("Enter PlanDuration :");
			a.setPlanDuration(sc.nextInt());
			System.out.println("Enter PlanAmount :");
			a.setPlanAmount(sc.nextInt());
			System.out.println("Enter No Of Screens :");
			a.setNoOfScreens(sc.nextInt());
			System.out.println("Enter Discount Amount :");
			a.setDiscountAmount(sc.nextInt());
			api.addPlan(a);

	}

}

package plan;

public class TestInsertPlan {

	public static void main(String[] args) throws Exception {
		AmazonPlanImplements api = new AmazonPlanImplements();
		Plan a = new Plan();
		a.planId = 310;
		a.planDuration=3200;
		a.planAmount=2500;
		a.noOfScreens=5;
		a.discountAmount=500;
		api.addPlan(a);

	}

}

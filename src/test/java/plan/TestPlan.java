package plan;

import java.util.ArrayList;

import com.chainsys.primevideos.imp.AmazonPlanImplements;
import com.chainsys.primevideos.method.Plan;

public class TestPlan {

	public static void main(String[] args) throws Exception {
		AmazonPlanImplements api = new AmazonPlanImplements();
		ArrayList<Plan> a1 = api.List();
		for (Plan plan : a1) {
			System.out.println(plan);
		}
		
	}

}

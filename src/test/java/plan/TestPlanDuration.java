package plan;

import java.util.ArrayList;

import com.chainsys.primevideos.imp.AmazonPlanImplements;
import com.chainsys.primevideos.method.Plan;

public class TestPlanDuration {

	public static void main(String[] args) throws Exception {
		AmazonPlanImplements all = new AmazonPlanImplements();
		ArrayList<Plan> a1 = all.list();
		for (Plan plan : a1) {
			System.out.println(plan);
		}
}
}

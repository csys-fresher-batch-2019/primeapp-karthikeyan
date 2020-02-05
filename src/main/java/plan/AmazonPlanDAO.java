package plan;

import java.util.ArrayList;
import java.util.List;

public interface AmazonPlanDAO {
	//insert into plans(plan_id,plan_amount,plan_duration,no_of_screens) values (121,199,30,1);
	void addPlan(Plan plans) throws Exception;
    //select * from plan;
	ArrayList<Plan> List() throws Exception;
	//select * from plans where plan_duration >=90;
	ArrayList<Integer> getPlanDuration(int PlanDuration) throws Exception;
	//select * from plans where plan_amount<=500;
	ArrayList<Plan> getPlansamount(int PlanAmount) throws Exception;
	//select * from plans where plan_duration = 180 and plan_amount <=1000;
	ArrayList<Plan> getPlans(int PlanDuration,int PlanAmount);


}

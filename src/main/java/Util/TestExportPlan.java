package util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import com.chainsys.primevideos.imp.AmazonPlanImplements;
import com.chainsys.primevideos.method.Plan;

public class TestExportPlan {

	public static void main(String[] args) throws Exception {
		AmazonPlanImplements imp = new AmazonPlanImplements();
		ArrayList<Plan> e = imp.List();
		String filecontents = "";
		for(Plan ae : e)
		{
			String line = ae.planId+","+ae.planDuration+","+ae.planAmount+","+ae.noOfScreens+","+ae.discountAmount;
			
			filecontents = filecontents + line+ "\n"; 
		}
		System.out.println(filecontents);
		
		Path path = Paths.get("D:\\gre.txt");
		
		Files.write(path, filecontents.getBytes(),StandardOpenOption.APPEND );
	}

}

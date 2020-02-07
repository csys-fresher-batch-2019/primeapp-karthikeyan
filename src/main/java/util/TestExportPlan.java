package util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import com.chainsys.primevideos.imp.AmazonPlanImplements;
import com.chainsys.primevideos.method.Plan;

import logger.Logger;

public class TestExportPlan {
	static Logger logger = new Logger();
	public static void main(String[] args) throws Exception {
		AmazonPlanImplements imp = new AmazonPlanImplements();
		ArrayList<Plan> e = imp.list();
		String filecontents = "";
		for(Plan ae : e)
		{
			String line = ae.getPlanId()+","+ae.getPlanDuration()+","+ae.getPlanAmount()+","+ae.getNoOfScreens()+","+ae.getDiscountAmount();
			
			filecontents = filecontents + line+ "\n"; 
		}
		logger.info(filecontents);
		
		Path path = Paths.get("D:\\gre.txt");
		
		Files.write(path, filecontents.getBytes(),StandardOpenOption.APPEND );
	}

}
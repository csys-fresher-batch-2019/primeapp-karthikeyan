package testAdmin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chainsys.primevideos.imp.AmazonPlanImplements;
import com.chainsys.primevideos.imp.PrimeReleasesDAOImp;
import com.chainsys.primevideos.imp.UserCreditsImp;
import com.chainsys.primevideos.method.Plan;
import com.chainsys.primevideos.method.PrimeReleases;
import com.chainsys.primevideos.method.UserCredits;

import util.MailUtil1;

public class TestSendMailUsers {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UserCreditsImp as = new UserCreditsImp();
		AmazonPlanImplements asx = new AmazonPlanImplements();
		PrimeReleasesDAOImp ad = new PrimeReleasesDAOImp();
		ArrayList<UserCredits> a1 = as.list1();
		System.out.println("Send Mail  to Users");
		System.out.println("1. To Send Mail To All Users");
		System.out.println("2. To Send Mail To Particular Users");
		int S = sc.nextInt();
		switch (S) {
		case 1: {
			System.out.println("Message to Send");
			System.out.println("1. To send a Msg");
			System.out.println("2. To send a Movie Suggestion");
			System.out.println("3. To send a Plan Suggestion");
			int SS = sc.nextInt();
			switch (SS) {
			case 1: {
				for (UserCredits a : a1) {
					String msg1 = "Hi " + a.getCustomerName() + "User ID : " + a.getUserId()
							+ "Prime video ShutDown Between timings 5.00pm to 8.00pm";
					MailUtil1.send(a.getMailId(), "Prime Video Message", msg1, 3);
				}
				break;

			}
			case 2: {
				System.out.println("Enter the Movie ID :");
				int moId = sc.nextInt();
				List<PrimeReleases> details = ad.getDetails(moId);
				StringBuilder content = new StringBuilder();
				for (PrimeReleases r : details) {
					content.append(r.toString());
				}
				System.out.println(content);
				
				String mailMsg = content.toString();
				//System.out.println(mailMsg);

				for (UserCredits a : a1) {
					MailUtil1.send1(a.getUserId(),a.getCustomerName(),a.getMailId(), "Prime Video Message", mailMsg, 3);
				}
			}
			case 3: {
				System.out.println("Enter the Plan ID :");
				int planId = sc.nextInt();
				List<Plan>  plans = asx.list1(planId);
				StringBuilder content = new StringBuilder();
				for (Plan r : plans) {
					content.append(r.toString());
				}
				System.out.println(content);
				
				String mailMsg = content.toString();
				//System.out.println(mailMsg);

				for (UserCredits a : a1) {
					MailUtil1.send1(a.getUserId(),a.getCustomerName(),a.getMailId(), "Prime Video Message", mailMsg, 3);
				}
			}
			}
		}
			case 2:
			{
				System.out.println("Enter the Amount of Users to Send Mail");
				int t = sc.nextInt();
				sc.nextLine();
				int i=1;
				String[] userId = new String[t];
				System.out.println("Enter the UserIds");
				for(i=0;i<t;i++)
				{
					userId[i] = sc.next();
				}
				for(i=0;i<t;i++)
				{
					
					System.out.print(userId[i]);
				}
			}
		
		}}}


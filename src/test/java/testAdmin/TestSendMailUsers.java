package testAdmin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chainsys.primevideos.imp.PrimeReleasesDAOImp;
import com.chainsys.primevideos.imp.UserCreditsImp;
import com.chainsys.primevideos.method.PrimeReleases;
import com.chainsys.primevideos.method.UserCredits;

import util.MailUtil1;

public class TestSendMailUsers {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UserCreditsImp as = new UserCreditsImp();
		PrimeReleasesDAOImp ad = new PrimeReleasesDAOImp();
		ArrayList<UserCredits> a1 = as.list1();		
		UserCredits asa =new UserCredits();
		System.out.println("Send Mail  to Users");
		System.out.println("1. To Send Mail To All Users");
		System.out.println("2. To Send Mail To Particular Users");
		int S = sc.nextInt();
		switch(S)
		{
		case 1:
		{
			System.out.println("Message to Send");
			System.out.println("1. To send a Msg");
			System.out.println("2. To send a Movie Suggestion");
			System.out.println("3. To send a Plan Suggestion");
			int SS =sc.nextInt();
			switch(SS)
			{
			case 1:
			{
				System.out.println("Type the Message to Be Sent");			
				String msg1 =sc.nextLine();
				
				for (UserCredits a : a1) {
					MailUtil1.send(a.getMailId(),"Prime Video Message",msg1,3);
				}
				break;
				
			}
			case 2:
			{
				System.out.println("Enter the Movie ID :");
				int moId = sc.nextInt();
				List<PrimeReleases> a2 = ad.getDetails(moId);
				PrimeReleases asd =new PrimeReleases();
				
				
				for (UserCredits a : a1) {
					String msg = "User ID : "+a.getUserId()+"\n Dear "+a.getCustomerName();
					String msg1 =sc.next();
					msg = msg +"\n"+msg1;
					MailUtil1.send(a.getMailId(),"Prime Video Message",msg,3);
				}
			}
			}
			
		}
		}

	}

}

package testAdmin;

import java.util.Scanner;

import com.chainsys.primevideos.imp.UserCreditsImp;

import testUserCredits.TestViewUsers;
import util.MailUtil1;

public class TestUserAdminInterface {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		UserCreditsImp as = new UserCreditsImp();
		System.out.println("Prime Videos UserCredits");
		System.out.println("1.To View all Users");
		System.out.println("2.To Search Viewers");
		System.out.println("3.To Delete Users");
		System.out.println("4.To Send Mail to Users");
		int choise1 = sc.nextInt();
		switch(choise1)
		{
		case 1:
		{
			TestViewUsers.main(null);
			break;
		}
		case 2:
		{
			System.out.println("Enter the MailID");
			as.profile(sc.next());
			break;
		}
		case 3:
		{
			System.out.println("Enter the MailId of the User to delete");
			String mailId =sc.next();
			if(as.deleteUser(mailId))
			{
			System.out.println("Enter the Reason to Delete the User");
			String reason =sc.nextLine();
			
			MailUtil1.send(mailId,"PrimeVideo Account Deletion",reason,1);
			}
			else
				{
				System.out.println("Deletion operation failed");
				}
				break;
				}
		case 4:
		{
			TestSendMailUsers.main(null);
			break;
		}
	}
		

}
}

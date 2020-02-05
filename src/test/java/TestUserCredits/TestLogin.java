package TestUserCredits;
import java.util.Scanner;
import usercredits.UserCreditsImp;
public class TestLogin {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UserCreditsImp as = new UserCreditsImp();
		System.out.println("Login User");
		System.out.println("Enter Email ID");
		String EmailId = sc.next();
		if (as.userLogin(EmailId)) {	
			
			int b = 0;
			int c = 0;
			while (b != 1 && c != 3) {
				System.out.println("Enter Password");
				String Password = sc.next();
				String pass = as.Password(EmailId);
				if (pass.equals(Password)) {
					System.out.println("Login Successfull");
					b = 1;

				} else {
					c++;
					System.out.println("Incorrect passord - Attempt :" + c);
					System.out.println("-----------------");
					if ( c ==3 ) {
						System.out.println("You have exceeded the maximum attempts - 3");
						 TestHelp.main();
						break;
					}
					
				}

			}
		}
	}
}

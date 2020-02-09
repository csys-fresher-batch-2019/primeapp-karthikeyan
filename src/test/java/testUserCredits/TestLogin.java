package testUserCredits;
import java.util.Scanner;

import com.chainsys.primevideos.imp.UserCreditsImp;
public class TestLogin {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UserCreditsImp as = new UserCreditsImp();
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------------------------------------");
		System.out.println("Login User");
		System.out.println("Enter Email ID");
		String EmailId = sc.next();
		if (as.userLogin(EmailId)) {	
			
			int b = 0;
			int c = 0;
			while (b != 1 && c != 3) {
				
				System.out.println("Enter Password");
				String Password = sc.next();
				String pass = as.password(EmailId);
				if (pass.equals(Password)) {
					System.out.println("Login Successfull");
					b = 1;
					TestPage.main(EmailId);

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
			else
				{
					TestUserInterface.main(null);
				}
		sc.close();
			}
		}
		
	


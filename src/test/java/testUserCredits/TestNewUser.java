package testUserCredits;

import java.time.LocalDate;
import java.util.Scanner;

import com.chainsys.primevideos.imp.UserCreditsImp;
import com.chainsys.primevideos.method.UserCredits;

public class TestNewUser {
	public static void main(String mailIds) throws Exception {
		UserCreditsImp apa = new UserCreditsImp();
		UserCredits asa = new UserCredits();
		asa.setMailId(mailIds);
	    Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter CustomerName");
	 	asa.setCustomerName(sc.next());
	 	System.out.println("Enter Gender(M/F)");
	 	asa.setGender(sc.next());
	 	System.out.println("Enter DOB(yyyy-mm-dd)");
	 	String dates =sc.next();
	 	LocalDate dobs = LocalDate.parse(dates);
	 	asa.setDob(dobs);
	 	System.out.println("Enter Age");
	 	asa.setAge(sc.nextInt());
	 	System.out.println("Enter MobileNo");
	 	asa.setMobileNumber(sc.nextLong());
	 	apa.userUpdate(asa);
	 	
	}

}

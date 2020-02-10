package testUserCredits;

import java.util.ArrayList;

import com.chainsys.primevideos.imp.UserCreditsImp;
import com.chainsys.primevideos.method.UserCredits;

public class TestViewUsers {

	public static void main(String[] args) throws Exception {
		UserCreditsImp as = new UserCreditsImp();
		ArrayList<UserCredits> ap = as.list();
		int i=1;
		for (UserCredits a : ap)
		{   System.out.println("UserNo "+i++);
			System.out.println(a);
			System.out.println("-----------------------------------------");
		}

	}

}

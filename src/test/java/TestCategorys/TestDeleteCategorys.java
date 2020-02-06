package TestCategorys;

import java.util.Scanner;

import com.chainsys.primevideos.imp.AmazonCategorysImp;

public class TestDeleteCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Category ID");
		int categoryId=sc.nextInt();
		ae.deleteupdatecategorys(categoryId);
		
		

	}

}

package TestCategorys;

import java.sql.SQLException;
import java.util.Scanner;

import categorys.AmazonCategorysImp;

public class TestDeleteCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Category ID");
		int categoryId=sc.nextInt();
		ae.deleteupdatecategorys(categoryId);
		
		

	}

}

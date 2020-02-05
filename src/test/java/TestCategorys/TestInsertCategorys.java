package TestCategorys;

import java.util.Scanner;

import categorys.AmazonCategorysImp;
import categorys.categorys;

public class TestInsertCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Category Name");
		int categoryid  =  sc.nextInt();
		System.out.println("Enter the Category Name");
		 /*String categoryName1 =sc.next();
		EnumCategorys categoryName = EnumCategorys.valueOf(categoryName1);*/
		String categoryName = String.valueOf(sc.next());
		ae.addCategorys(categoryid,categoryName);
	}

}

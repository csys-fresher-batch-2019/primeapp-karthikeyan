package TestCategorys;

import java.util.Scanner;

import categorys.AmazonCategorysImp;
import categorys.categorys;

public class TestUpdateCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();		
		Scanner sc = new Scanner(System.in);
		int categoryId=sc.nextInt();
		String categoryName=sc.next();
		ae.updatecategory(categoryId, categoryName);
		

	}

}

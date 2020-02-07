package testCategorys;

import java.util.Scanner;

import com.chainsys.primevideos.imp.AmazonCategorysImp;

public class TestUpdateCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();		
		Scanner sc = new Scanner(System.in);
		int categoryId=sc.nextInt();
		String categoryName=sc.next();
		ae.updateCategory(categoryId, categoryName);
		

	}

}

package testCategorys;

import java.util.Scanner;

import com.chainsys.primevideos.imp.AmazonCategorysImp;

public class TestInsertCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Category Name");
		int categoryid  =  sc.nextInt();
		System.out.println("Enter the Category Name");
		String categoryName = String.valueOf(sc.next());
		ae.addCategorys(categoryid,categoryName);
		sc.close();
	}

}

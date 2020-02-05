package TestCategorys;

import java.util.ArrayList;
import java.util.Scanner;

import categorys.AmazonCategorysImp;
import categorys.categorys;
import plan.Plan;

public class TestSelectCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();
		ArrayList<categorys>  aw = ae.getcategorys();
		for (categorys pl : aw) {
			System.out.println(pl);
		}
	}

}

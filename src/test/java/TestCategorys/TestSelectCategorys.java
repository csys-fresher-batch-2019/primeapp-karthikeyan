package TestCategorys;

import java.util.ArrayList;

import com.chainsys.primevideos.imp.AmazonCategorysImp;
import com.chainsys.primevideos.method.categorys;

public class TestSelectCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();
		ArrayList<categorys>  aw = ae.getcategorys();
		for (categorys pl : aw) {
			System.out.println(pl);
		}
	}

}

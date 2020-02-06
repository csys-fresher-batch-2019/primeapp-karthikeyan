package testCategorys;

import java.util.ArrayList;

import com.chainsys.primevideos.imp.AmazonCategorysImp;
import com.chainsys.primevideos.method.Categorys;

public class TestSelectCategorys {

	public static void main(String[] args) throws Exception {
		AmazonCategorysImp ae = new AmazonCategorysImp();
		ArrayList<Categorys>  aw = ae.getcategorys();
		for (Categorys pl : aw) {
			System.out.println(pl);
		}
	}

}

package categorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.TestConnection;

public class AmazonCategorysImp implements categorydao {

	public void addCategorys(int id, String category) throws Exception {
		String sql = "insert into categorys (category_id,category_name) values ("+id+",'"+category.toString()+"')"; 
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);				
		int row = pst.executeUpdate();
		System.out.println(row);
		
	}


	public ArrayList<categorys> getcategorys() throws Exception {
		String sql = "select * from categorys"; 
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);				
		ResultSet row = pst.executeQuery();
		System.out.println(row);
		ArrayList<categorys> ww = new ArrayList<categorys>();
		
		while(row.next())
		{
		int a=row.getInt(1);
		String b= row.getString(2);
		
		categorys ae = new categorys();;
		ae.setCategoryId(a);
		ae.setCategoryName(b);
		
		ww.add(ae);
	}
		
		return ww;
}
	
		
	

	public void deleteupdatecategorys(int categoryid) throws Exception {
		String sql ="delete categorys where category_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		pst.setInt(1,categoryid);
		int row = pst.executeUpdate();
		System.out.println(row);
	}

	public void updatecategory(int categoryid,String categoryname) throws Exception {
		String sql = "update categorys set category_name = ? where category_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		pst.setString(1,categoryname);
		pst.setInt(2,categoryid);
		int row = pst.executeUpdate();
		System.out.println(row);
	}


	public void addCategorys(String category) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
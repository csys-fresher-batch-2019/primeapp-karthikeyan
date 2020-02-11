package com.chainsys.primevideos.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.chainsys.primevideos.dao.CategoryDAO;
import com.chainsys.primevideos.method.Categorys;

import connection.TestConnection;
import exception.DbException;
import logger.Logger;

public class AmazonCategorysImp implements CategoryDAO {
	Logger logger = Logger.getInstance();

	public void addCategorys(int id, String category) throws DbException {
		
			String sql = "insert into categorys (category_id,category_name) values (?,?)"; 
			logger.info("hello");
			try(Connection con = TestConnection.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);)
			{
				logger.info("hello");
				pst.setInt(1, id);
				pst.setString(2, category);
				int row = pst.executeUpdate();
				logger.info(row);
			}
			catch(Exception e)
			{
				throw new DbException("Category Insertion Failed");
		} 
		
	}


	public ArrayList<Categorys> getcategorys() throws Exception {
		
			String sql = "select * from categorys"; 
			try(Connection con = TestConnection.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);){			
			try(ResultSet row = pst.executeQuery();){
			ArrayList<Categorys> ww = new ArrayList<>();
			
			while(row.next())
			{
			int a=row.getInt(1);
			String b= row.getString(2);
			
			Categorys ae = new Categorys();
			ae.setCategoryId(a);
			ae.setCategoryName(b);
			
			ww.add(ae);
}
			
			return ww;}}
			catch(DbException e)
			{
				throw new Exception("Category View Failed");
			}
		
		
		
			
}
	
		
	

	public void deleteUpdateCategorys(int categoryid) throws Exception {
		String sql ="delete categorys where category_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){	
		pst.setInt(1,categoryid);
		int row = pst.executeUpdate();
		logger.info(row);}
		catch(DbException e)
		{
			throw new Exception("Category Deletion Failed");
		}
	}

	public void updateCategory(int categoryid,String categoryname) throws Exception {
		String sql = "update categorys set category_name = ? where category_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1,categoryname);
		pst.setInt(2,categoryid);
		int row = pst.executeUpdate();
		logger.info(row);}
		catch(DbException e)
		{
			throw new Exception("Plan Insertion Failed");
		}
	}


	public void addCategorys(String category) throws Exception {
		throw new UnsupportedOperationException();
	}

}
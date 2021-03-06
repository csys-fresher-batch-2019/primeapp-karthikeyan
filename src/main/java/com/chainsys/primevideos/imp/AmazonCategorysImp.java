package com.chainsys.primevideos.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.primevideos.dao.CategoryDAO;
import com.chainsys.primevideos.method.Categorys;

import connection.TestConnection;
import exception.DbException;
import exception.InfoMessages;
import logger.Logger;

public class AmazonCategorysImp implements CategoryDAO {
	Logger logger = Logger.getInstance();

	public void addCategorys(int id, String category) throws DbException {
		
			String sql = "insert into categorys (category_id,category_name) values (?,?)"; 
			try(Connection con = TestConnection.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);)
			{
				pst.setInt(1, id);
				pst.setString(2, category);
				int row = pst.executeUpdate();
				logger.info(row);
			}
			catch (SQLException e1) {
				throw new DbException(InfoMessages.ADDCATEGORY);
			} 
			 catch (Exception e1) {
					throw new DbException(InfoMessages.CONNECTION);
				}
		
	}


	public ArrayList<Categorys> getcategorys() throws DbException {
		
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
			catch (SQLException e1) {
				throw new DbException(InfoMessages.VIEWCATEGORY);
			} 
			 catch (Exception e1) {
					throw new DbException(InfoMessages.CONNECTION);
				}
		
		
		
			
}
	
		
	

	public void deleteUpdateCategorys(int categoryid) throws DbException {
		String sql ="delete categorys where category_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){	
		pst.setInt(1,categoryid);
		int row = pst.executeUpdate();
		logger.info(row);}
		catch (SQLException e1) {
			throw new DbException(InfoMessages.DELETECATEGORY);
		} 
		 catch (Exception e1) {
				throw new DbException(InfoMessages.CONNECTION);
			}
	}

	public void updateCategory(int categoryid,String categoryname) throws DbException {
		String sql = "update categorys set category_name = ? where category_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1,categoryname);
		pst.setInt(2,categoryid);
		int row = pst.executeUpdate();
		logger.info(row);}
		catch (SQLException e1) {
			throw new DbException(InfoMessages.UPDATECATEGORY);
		} 
		 catch (Exception e1) {
				throw new DbException(InfoMessages.CONNECTION);
			}
	}


	

}
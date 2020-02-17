package com.chainsys.primevideos.imp;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.chainsys.primevideos.dao.WatchListDAO;

import connection.TestConnection;
import exception.DbException;
import exception.InfoMessages;
import logger.Logger;
public class WatchListDAOImp implements WatchListDAO {
	static Logger logger = Logger.getInstance();

	public void likes(String mailId, int primeId) throws DbException {
		boolean row = false;
		try(Connection con = TestConnection.getConnection();
				CallableStatement cstmt = con.prepareCall("{call LIKES(?,?)}");)
		        {
				cstmt.setString(1, mailId);
				cstmt.setInt(2, primeId);
				row = cstmt.execute();
				}
				catch (SQLException e1) 
				{
					throw new DbException(InfoMessages.OPERATION);
				} 
				 catch (Exception e1) 
				{
						throw new DbException(InfoMessages.CONNECTION);
				}
			if(row == true)
			System.out.println("Thanks for your Review");
			}
	public void dislikes(String mailId, int primeId) throws DbException {
		boolean row = false;
		try(Connection con = TestConnection.getConnection();
				CallableStatement cstmt = con.prepareCall("{call DISLIKES(?,?)}");)
		        {
				cstmt.setString(1, mailId);
				cstmt.setInt(2, primeId);
				row = cstmt.execute();
				}
				catch (SQLException e1) 
				{
					throw new DbException(InfoMessages.OPERATION);
				} 
				 catch (Exception e1) 
				{
						throw new DbException(InfoMessages.CONNECTION);
				}
			if(row == true)
			System.out.println("Thanks for your Review");
			}		

	public void viewerRating(String mailId, int primeId, int viewerRating) throws DbException {
		boolean row = false;
		try(Connection con = TestConnection.getConnection();
				CallableStatement cstmt = con.prepareCall("{call VIEWER_REIVEW(?,?,?)}");)
		        {
				cstmt.setInt(3,viewerRating);
				cstmt.setString(1, mailId);
				cstmt.setInt(2, primeId);				
				row = cstmt.execute();
				}
				catch (SQLException e1) 
				{
					throw new DbException(InfoMessages.OPERATION);
				} 
				 catch (Exception e1) 
				{
						throw new DbException(InfoMessages.CONNECTION);
				}
			if(row == true)
			System.out.println("Thanks for your Review");
			}
			
		
	

	public boolean updateWatched(String mailId, int primeId,int decide) throws DbException {
		boolean row = false;
		try(Connection con = TestConnection.getConnection();
				CallableStatement cstmt = con.prepareCall("{call INCREMENT_WATCHED_BY_ONE(?,?,?)}");)
		        {
				cstmt.setInt(3, decide);
				cstmt.setString(1, mailId);
				cstmt.setInt(2, primeId);
				row = cstmt.execute();
				}
				catch (SQLException e1) 
				{
					throw new DbException(InfoMessages.OPERATION);
				} 
				 catch (Exception e1) 
				{
						throw new DbException(InfoMessages.CONNECTION);
				}
			if(row == true)
			System.out.println("Enjoy PRIME VIDEOS");
			return row;
			}


	@Override
	public void likes(String mailID, int primeId, int likes) {
		// TODO Auto-generated method stub
		
	}
				
		
	}

	
	



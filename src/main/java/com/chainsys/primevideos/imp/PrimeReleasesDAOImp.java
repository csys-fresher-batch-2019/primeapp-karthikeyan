package com.chainsys.primevideos.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.primevideos.dao.PrimeReleasesDAO;
import com.chainsys.primevideos.method.PrimeReleases;

import connection.TestConnection;
import exception.DbException;
import exception.InfoMessages;
import logger.Logger;

public class PrimeReleasesDAOImp implements PrimeReleasesDAO {
	static Logger logger = Logger.getInstance();


	private static void printLocal() {
		logger.info("Prime Id   Name of Video");
	}
	
	public ArrayList<PrimeReleases> getSearchMovies(String sql) throws DbException {
		return commonCall(sql);
		
	}

	public List<PrimeReleases> PowerSearchMethod(String sql) throws DbException {
		return commonCall(sql);
		}

	private static ArrayList<PrimeReleases> commonCall(String sql) throws DbException {
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		try(ResultSet rs = pst.executeQuery();){
		ArrayList<PrimeReleases> l = new ArrayList<>();
		printLocal();
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			logger.info(a+"      "+b);
		}			
		return l;}
		}
		catch (SQLException e1) {
			throw new DbException(InfoMessages.viewVideo);
		} 
		 catch (Exception e1) {
				throw new DbException(InfoMessages.Connection);
			}
	}
	
	public List<PrimeReleases> getDetails(int id) throws DbException
	{
		String sql ="Select * from prime_releases where prime_id = ?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	){
		pst.setInt(1,id);
		try(ResultSet rs = pst.executeQuery();){
		List<PrimeReleases> l = new ArrayList<>();
		rs.next();
		int a = rs.getInt(1);
		int b = rs.getInt(2);
		String c = rs.getString(3);
		String d = rs.getString(4);
		int e = rs.getInt(5);
		int f = rs.getInt(6);
		String g = rs.getString(7);
		String h = rs.getString(8);
		String i = rs.getString(9);
		Date j = rs.getDate(10);
		Date k = rs.getDate(11);
		int m = rs.getInt(12);
		String n = rs.getString(13);
		String o = rs.getString(14);
		PrimeReleases ad  =new PrimeReleases();
		ad.setPrimeId(a);
		ad.setCategoryId(b);
		ad.setNameofVideo(c);
		ad.setGenre(d);
		ad.setSeason(e);
		ad.setTotalEpisodes(f);
		ad.setAudioLanguages(g);
		ad.setSubtitleLanguages(h);
		ad.setDirector(i);		
		ad.setReleaseDate(j.toLocalDate());
		ad.setPrimereleaseDate(k.toLocalDate());
		ad.setBoxofficecollectionuinmillions(m);
		ad.setCasting(n);
		ad.setDescriptionofvideo(o);
		l.add(ad);
		//logger.info(ad);
		return l;
			}	}
		catch (SQLException e1) {
			throw new DbException(InfoMessages.viewVideo);
		} 
		 catch (Exception e1) {
				throw new DbException(InfoMessages.Connection);
			}
		}
	
	
	public ArrayList<PrimeReleases> list(String sqlq) throws Exception{
		String sql = sqlq;
		return callFunction(sql);
	}
	public ArrayList<PrimeReleases> list1() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where ROWNUM<=5  order by release_date desc";
		return callFunction(sql);
		}
	public ArrayList<PrimeReleases> list2() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where ROWNUM<=10  order by imdb_rating desc";
		return callFunction(sql);
		}
	public ArrayList<PrimeReleases> list3() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where originals = 1 and ROWNUM<=10  order by imdb_rating desc";
		return callFunction(sql);			
		}
	public ArrayList<PrimeReleases> list4() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where ROWNUM<=5  order by prime_release_date desc";
		return callFunction(sql);		
		}
	private static ArrayList<PrimeReleases> callFunction(String sql) throws DbException{
		return commonCall(sql);}

	public  ArrayList<PrimeReleases> completeSearch(String sql) throws DbException {
		return commonCall(sql);
	}
	


	

	
		
	}
	

	



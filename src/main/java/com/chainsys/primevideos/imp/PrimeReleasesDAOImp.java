package com.chainsys.primevideos.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.primevideos.dao.PrimeReleasesDAO;
import com.chainsys.primevideos.method.PrimeReleases;

import connection.TestConnection;
import exception.DbException;
import logger.Logger;

public class PrimeReleasesDAOImp implements PrimeReleasesDAO {
	Logger logger = Logger.getInstance();

	public List<PrimeReleases> completeSearch(String get,String term) throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases where ? =?";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, get);
		pst.setString(2, term);
		try(ResultSet rs = pst.executeQuery();){
		logger.info(sql);
		ArrayList<PrimeReleases> l = new ArrayList<>();
		logger.info("Prime Id   Name of Video");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			logger.info(a+"        "+b);
		}			
		return l;}}
		catch(DbException e)
		{
			throw new Exception("Selection Search View Failed");
		}
	}
	public List<PrimeReleases> likeSearch(String term,String search) throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases where ? LIKE %?%";
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, term);
		pst.setString(2, search);
		try(ResultSet rs = pst.executeQuery();){
		ArrayList<PrimeReleases> l = new ArrayList<>();
		logger.info("Prime Id   Name of Video");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			logger.info(a+"      "+b);
		}			
		return l;}}
		catch(DbException e)
		{
			throw new Exception("Like Search Failed");
		}
		
	}
	public List<PrimeReleases> commonMethod(String term, String val, String sql) throws Exception {
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){
			
		pst.setString(1, term);
		pst.setString(2, val);
		try(ResultSet rs = pst.executeQuery();){
		ArrayList<PrimeReleases> l = new ArrayList<>();
		logger.info("Prime Id   Name of Video");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			logger.info(a+"      "+b);
		}			
		return l;}
		}
		catch(DbException e)
		{
			throw new Exception("Common Search Method Failed");
		}
	}
	public List<PrimeReleases> getDetails(int id) throws Exception
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
		ad.primeId = a;
		ad.categoryId=b;
		ad.nameofVideo=c;
		ad.genre=d;
		ad.season=e;
		ad.totalEpisodes=f;
		ad.audioLanguages=g;
		ad.subtitleLanguages=h;
		ad.director=i;		
		ad.releaseDate=j.toLocalDate();
		ad.primereleaseDate=k.toLocalDate();
		ad.boxofficecollectionuinmillions=m;
		ad.casting=n;
		ad.descriptionofvideo=o;
		l.add(ad);
		logger.info(ad);
		return null;	}	}
		catch(DbException e)
		{
			throw new Exception("Selection Video Details Failed");
		}
	
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
	private static ArrayList<PrimeReleases> callFunction(String sql) throws Exception{
		try(Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);){	
		try(ResultSet rs = pst.executeQuery();){
		ArrayList<PrimeReleases> l = new ArrayList<>();
		
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);
			
			
			PrimeReleases as = new PrimeReleases();
			as.primeId=a;
			as.nameofVideo=b;			
			l.add(as);
		}			
		return l;}}
		catch(DbException e)
		{
			throw new Exception("DataBase Operation Failed");
		}
	}
	public void addReleaseDetails(PrimeReleases primeRelease) {
		throw new UnsupportedOperationException();
	}
	public List<PrimeReleases> getPrimeReleases(String videoname) {
		throw new UnsupportedOperationException();
	}
	public String[] nameOfVideo(String like) {
		throw new UnsupportedOperationException();
	}
	public int addImdbRating(int primeID) {
		throw new UnsupportedOperationException();
	}
	public List<PrimeReleases> getGenres(String genre) {
		throw new UnsupportedOperationException();
	}
	public List<PrimeReleases> list() {
		throw new UnsupportedOperationException();
	}


	

	
		
	}
	

	



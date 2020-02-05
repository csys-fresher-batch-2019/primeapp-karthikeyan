package primereleases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Connection.TestConnection;
import plan.Plan;

public class PrimeReleasesDAOImp implements PrimeReleasesDAO {

	public void addReleaseDetails(PrimeReleases PrimeRelease) {
		
	}
	public List<PrimeReleases> getPrimeReleases(String videoname) {
		// TODO Auto-generated method stub
		return null;
	}
	public String[] nameOfVideo(String Like) {
		// TODO Auto-generated method stub
		return null;
	}
	public int addImdbRating(int primeID) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<PrimeReleases> getGenres(String genre) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<PrimeReleases> list() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<PrimeReleases> completeSearch(String get,String term) throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases where ? =?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, get);
		pst.setString(2, term);
		ResultSet rs = pst.executeQuery();
		System.out.println(sql);
		ArrayList<PrimeReleases> l = new ArrayList<PrimeReleases>();
		System.out.println("Prime Id   Name of Video");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			System.out.println(a+"        "+b);
		}			
		return l;
	}
	public List<PrimeReleases> likeSearch(String term,String search) throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases where ? LIKE %?%";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, term);
		pst.setString(2, search);
		ResultSet rs = pst.executeQuery();
		ArrayList<PrimeReleases> l = new ArrayList<PrimeReleases>();
		System.out.println("Prime Id   Name of Video");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			System.out.println(a+"      "+b);
		}			
		return l;
		
	}
	/*private List<PrimeReleases> commonMethod(String term, String val, String sql) throws Exception, SQLException {
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, term);
		pst.setString(2, val);
		ResultSet rs = pst.executeQuery();
		ArrayList<PrimeReleases> l = new ArrayList<PrimeReleases>();
		System.out.println("Prime Id   Name of Video");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);			
			System.out.println(a+"      "+b);
		}			
		return l;
	}*/
	public List<PrimeReleases> getDetails(int id) throws Exception
	{
		String sql ="Select * from prime_releases where prime_id = ?";
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		pst.setInt(1,id);
		ResultSet rs = pst.executeQuery();
		List<PrimeReleases> l = new ArrayList<PrimeReleases>();
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
		System.out.println(ad);
		return null;		
	
	}
	public ArrayList<PrimeReleases> list1() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where ROWNUM<=5  order by release_date desc";
		return CallFunction(sql);
		}
	public ArrayList<PrimeReleases> list2() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where ROWNUM<=10  order by imdb_rating desc";
		return CallFunction(sql);
		}
	public ArrayList<PrimeReleases> list3() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where originals = 1 and ROWNUM<=10  order by imdb_rating desc";
		return CallFunction(sql);			
		}
	public ArrayList<PrimeReleases> list4() throws Exception {
		String sql = "select prime_id,name_of_video from prime_releases  where ROWNUM<=5  order by prime_release_date desc";
		return CallFunction(sql);		
		}
	private static ArrayList<PrimeReleases> CallFunction(String sql) throws Exception{
		Connection con = TestConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);	
		ResultSet rs = pst.executeQuery();
		ArrayList<PrimeReleases> l = new ArrayList<PrimeReleases>();
		//
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);
			
			
			PrimeReleases as = new PrimeReleases();
			as.primeId=a;
			as.nameofVideo=b;			
			l.add(as);
		}			
		return l;
	}
	

	

	
		
	}
	

	



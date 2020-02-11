package testUserCredits;

//import java.util.ArrayList;
import java.util.Scanner;

import com.chainsys.primevideos.imp.PrimeReleasesDAOImp;
//import com.chainsys.primevideos.method.PrimeReleases;


public class TestSearch {
	public static void main(String EmailId) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrimeReleasesDAOImp ds = new PrimeReleasesDAOImp();
		ReadFile.main("Search");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{	
		String sql = "select prime_id,name_of_video from prime_releases where ";		
		System.out.println("Movie : ");
		String movie = sc.nextLine();
		if(movie.length()!=0)
		{
				sql = sql +"name_of_video Like '%"+movie+"%'";
			
		}
		System.out.println("Categorys 1 - TVShows  2 - Movies  3 - Kids\nCategorys : ");
		String Categorys = sc.nextLine();
		if(Categorys.length()!=0)
		{
				sql = sql+" category_id = '"+Categorys+"'";
		}
		System.out.println("IMDb (0-10): ");
		String IMDB = sc.nextLine();
		if(IMDB.length()!=0)
		{
				sql = sql+" imdb_rating = "+IMDB;
		}
		System.out.println("Language : ");
		String Language = sc.nextLine();
		if(Language.length()!=0)
		{
				sql = sql+" audio_languages = '"+Language+"'";
		}
		System.out.println("Director : ");
		String Director = sc.nextLine();
		if(Director.length()!=0)
		{
				sql = sql+" director  = '"+Director+"'";
		}
		System.out.println("Actor : ");
		String Actor = sc.nextLine();
		if(Actor.length()!=0)
		{
				sql = sql+" actor = '"+Actor+"'";
		}
		System.out.println("Genre : ");
		String Genre = sc.nextLine();
		if(Genre.length()!=0)
		{
				sql = sql+" genre = '"+Genre+"'";
		}
		System.out.println("Origials (1 - Yes ,2 - No): ");
		String Originals = sc.nextLine();
		if(Originals.length()!=0)
		{
				sql = sql+" originals = '"+Originals+"'";
		}	
		ds.PowerSearchMethod(sql);
		break;
		}
		case 2:
		{
			String sql ="select prime_id,name_of_video from prime_releases order by release_date desc";
			ds.PowerSearchMethod(sql);
			break;
		}
		case 3:
		{
			String sql = "select prime_id,name_of_video from prime_releases order by imdb_rating desc";
			ds.PowerSearchMethod(sql);
			break;
		}
		case 4:
		{
			String sql = "select prime_id,name_of_video from prime_releases where originals = 1 order by imdb_rating desc";
			ds.PowerSearchMethod(sql);
			break;
		}
		case 5:
		{
			String sql = "";
			ds.PowerSearchMethod(sql);
			break;
		}
		}
		System.out.println("To select movie Press 1\nTo search Again Press 2\nTo go to Main Page press 3");
		System.out.println("Select Type(1/2/3)");
		int s =sc.nextInt();
		if(s==1)
		{
			System.out.println("Enter the Movie ID");
			int id = sc.nextInt();
			ds.getDetails(id);
		}
		else if(s==2)
		{
			TestSearch.main(null);
		}
		else
		{
			TestPage.main(null);
		}
		//sc.close();
		}
}

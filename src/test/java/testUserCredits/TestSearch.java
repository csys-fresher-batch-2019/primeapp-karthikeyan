package testUserCredits;

import java.util.Scanner;

//import com.chainsys.primevideos.imp.PrimeReleasesDAOImp;

public class TestSearch {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//PrimeReleasesDAOImp ds = new PrimeReleasesDAOImp();
		ReadFile.main("Search");
		String sql = "select * from prime_releases where ";		
		System.out.println("Movie : ");
		String movie = sc.nextLine();
		if(movie.length()!=0)
		{
				sql = sql +"name_of_video Like %"+movie+"%";			
			
		}
		System.out.println("IMDb : ");
		String IMDB = sc.nextLine();
		if(IMDB.length()!=0)
		{
				sql = sql+"imdb_rating = "+IMDB;
		}
		System.out.println("Language : ");
		String Language = sc.nextLine();
		if(Language.length()!=0)
		{
				sql = sql+"language = "+Language;
		}
		System.out.println("Director : ");
		String Director = sc.nextLine();
		if(Director.length()!=0)
		{
				sql = sql+"director  = "+Director;
		}
		System.out.println("Actor : ");
		String Actor = sc.nextLine();
		if(Actor.length()!=0)
		{
				sql = sql+"actor = "+Actor;
		}
		System.out.println("Genre : ");
		String Genre = sc.nextLine();
		if(Genre.length()!=0)
		{
				sql = sql+"genre = "+Genre;
		}
		System.out.println("Categorys : ");
		String Categorys = sc.nextLine();
		if(Categorys.length()!=0)
		{
				sql = sql+"categorys = "+Categorys;
		}
		System.out.println("Origials (Y,N): ");
		String Originals = sc.nextLine();
		if(Originals.length()!=0)
		{
				sql = sql+"originals = "+Originals;
		}
		/*System.out.println("Release Year : ");
		String year = sc.nextLine();
		if(year.length()!=0)
		{
			a=1;
			if(a==1)
			{
				sql = sql+" = "+IMDB;
				a=0;
			}
		}*/
		
		sc.close();
	}
	
}
		/*System.out.println("Enter the Search Method : ");
		System.out.println(a);
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.print("Search :   ");
			String a = sc.next();
			ds.likeSearch("name_of_video",a);
			break;
		}
		case 2:
		{
			System.out.print("Language : ");
			String a = sc.next();
			ds.completeSearch("audio_languages",a);
			break;
		}
		case 3:
		{
			System.out.print("Director :  ");
			String a = sc.next();
			ds.likeSearch("director",a);
			break;
		}
		case 5:
		{
			System.out.print("Genre :  ");
			String a = sc.next();
			ds.likeSearch("genre",a);
			break;
		}
		case 6:
		{
			System.out.print("Actors :  ");
			String a = sc.next();
			ds.likeSearch("casting",a);
			break;
		}
		}
	}
		private static void PrintMethod(ArrayList<PrimeReleases> weee) {
			for(PrimeReleases a : weee)
			{
				
				System.out.print(a.primeId+" "+ a.nameofVideo+"    ");
			}
			System.out.println();

	}}*/

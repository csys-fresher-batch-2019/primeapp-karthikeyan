package testUserCredits;

import java.util.ArrayList;
import java.util.Scanner;

import com.chainsys.primevideos.imp.PrimeReleasesDAOImp;
import com.chainsys.primevideos.method.PrimeReleases;

import exception.DbException;

public class TestHome {
	
	public static void main(String emailId) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------AMAZON---------------------------------------------------------");
		System.out.println("-------------------------------------------------Prime Video------------------------------------------------------");
		PrimeReleasesDAOImp as = new PrimeReleasesDAOImp();	
		System.out.println();
		System.out.println();
		System.out.println("TOP PRIORITIES");
		ArrayList<PrimeReleases> we = as.list2();
		printMethod(we);
		ReadFile.main("Languages");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("New Releases");
		ArrayList<PrimeReleases> we1 = as.list1();
		printMethod(we1);
		System.out.println("Originals");
		ArrayList<PrimeReleases> we2 = as.list3();
		printMethod(we2);
		System.out.println("Recently added Movies");
		ArrayList<PrimeReleases> we3 = as.list4();
		printMethod(we3);
		System.out.println("To search by MovieId Press 1");
		System.out.println("To search by language Press 2");
		System.out.println("Select Type(1/2)");
		int s =sc.nextInt();
		if(s==1)
		{
			movieIdSearch(sc, as);
		}
		else if(s==2)
		{
			System.out.println("Enter the Language");
			String lang = sc.next();
			String sql = "select prime_id,name_of_video from prime_releases where audio_languages = '"+lang+"'";
			as.completeSearch(sql);
			movieIdSearch(sc, as);
			
		}
		else
		{
			System.out.println("Enter Valid Type(1/2)");
		}
		
	}

	private static void movieIdSearch(Scanner sc, PrimeReleasesDAOImp as) throws DbException {
		System.out.println("Enter the Movie ID");
		int id = sc.nextInt();
		as.getDetails(id);
	}
	
	public static void printMethod(ArrayList<PrimeReleases> weee) {
		System.out.println("Prime Id   Name of the Video");
		for(PrimeReleases a : weee)
		{			
			System.out.println(a.getPrimeId()+"     "+ a.getNameofVideo());
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
	}
	
}

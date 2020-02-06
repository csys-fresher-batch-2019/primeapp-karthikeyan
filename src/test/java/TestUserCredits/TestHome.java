package testUserCredits;

import java.util.ArrayList;
import java.util.Scanner;

import com.chainsys.primevideos.imp.PrimeReleasesDAOImp;
import com.chainsys.primevideos.method.PrimeReleases;

public class TestHome {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------AMAZON---------------------------------------------------------");
		System.out.println("-------------------------------------------------Prime Video------------------------------------------------------");
		PrimeReleasesDAOImp as = new PrimeReleasesDAOImp();	
		ArrayList<PrimeReleases> we = as.list2();
		ArrayList<PrimeReleases> wee = as.list1();
		ArrayList<PrimeReleases> weee = as.list3();
		ArrayList<PrimeReleases> weeee = as.list4();
		//List<PrimeReleases> weeeee = as.getAudioLanguages(audioLanguages);
		System.out.println();
		System.out.println();
		System.out.println("1 - TOP PRIORITIES");
		PrintMethod(we);
		ReadFile.main("Languages");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("1 - New Releases");
		PrintMethod(wee);
		System.out.println("1 - Originals");
		PrintMethod(weee);
		System.out.println("1 - Recently added Movies");
		PrintMethod(weeee);
		
		System.out.println("Select Type(1/2)");
		int s =sc.nextInt();
		if(s==1)
		{
			System.out.println("Enter the Movie ID");
			int id = sc.nextInt();
			as.getDetails(id);
		}
		else if(s==2)
		{
			System.out.println("Enter the Language");
			String lang = sc.next();
			as.completeSearch("audio_languages", lang);
			System.out.println("Enter the Movie ID");
			int id = sc.nextInt();
			as.getDetails(id);
			
		}
		else
		{
			System.out.println("Enter Valid Type(1/2)");
		}
	}
	
	private static void PrintMethod(ArrayList<PrimeReleases> weee) {
		System.out.println("Prime Id   Name of Video");
		for(PrimeReleases a : weee)
		{
			
			System.out.print(a.primeId+" "+ a.nameofVideo+"    ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
	}

}

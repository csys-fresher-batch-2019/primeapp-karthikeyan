package testUserCredits;

import java.util.ArrayList;
import java.util.Scanner;

import com.chainsys.primevideos.imp.PrimeReleasesDAOImp;
import com.chainsys.primevideos.method.PrimeReleases;

public class TestHome {
	
	public static void main(String EmailId) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------AMAZON---------------------------------------------------------");
		System.out.println("-------------------------------------------------Prime Video------------------------------------------------------");
		PrimeReleasesDAOImp as = new PrimeReleasesDAOImp();	
		ArrayList<PrimeReleases> we = as.list2();
		ArrayList<PrimeReleases> we1 = as.list1();
		ArrayList<PrimeReleases> we2 = as.list3();
		ArrayList<PrimeReleases> we3 = as.list4();
		System.out.println();
		System.out.println();
		System.out.println("TOP PRIORITIES");
		PrintMethod(we);
		ReadFile.main("Languages");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("New Releases");
		PrintMethod(we1);
		System.out.println("Originals");
		PrintMethod(we2);
		System.out.println("Recently added Movies");
		PrintMethod(we3);
		System.out.println("To search by MovieId Press 1");
		System.out.println("To search by language Press 2");
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
		sc.close();
	}
	
	public static void PrintMethod(ArrayList<PrimeReleases> weee) {
		System.out.println("Prime Id   Name of Video");
		for(PrimeReleases a : weee)
		{
			
			System.out.print(a.getPrimeId()+" "+ a.getNameofVideo()+"    ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
	}
	
}

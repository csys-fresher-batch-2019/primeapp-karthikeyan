package TestUserCredits;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import primereleases.PrimeReleases;
import primereleases.PrimeReleasesDAOImp;

public class TestSearch {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrimeReleasesDAOImp ds = new PrimeReleasesDAOImp();
		ReadFile.main("Search");
		System.out.println("Enter the Search Method : ");
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

	}}

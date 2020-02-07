package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.PrimeReleases;

public interface PrimeReleasesDAO {

	void addReleaseDetails(PrimeReleases PrimeRelease);
	
	List<PrimeReleases> getPrimeReleases(String videoname);
	
	String[] nameOfVideo(String Like);

	int addImdbRating (int primeID);
	
	List<PrimeReleases>  getGenres(String genre);

	List<PrimeReleases> list();

	List<PrimeReleases> list1() throws Exception;

	List<PrimeReleases> list2() throws Exception;
	
	List<PrimeReleases> list3() throws Exception;

}

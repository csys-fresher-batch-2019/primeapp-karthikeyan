package com.chainsys.primevideos.dao;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.primevideos.method.PrimeReleases;

public interface PrimeReleasesDAO {

	List<PrimeReleases> completeSearch(String get,String term) throws Exception;
	
	List<PrimeReleases> likeSearch(String term,String search) throws Exception;
	
	ArrayList<PrimeReleases> getSearchMovies(String sql) throws Exception;
	
	List<PrimeReleases> commonMethod(String term, String val, String sql) throws Exception;
	
	List<PrimeReleases> getDetails(int id) throws Exception;

	List<PrimeReleases> list1() throws Exception;

	List<PrimeReleases> list2() throws Exception;
	
	List<PrimeReleases> list3() throws Exception;
	
	List<PrimeReleases> list4() throws Exception;

}

package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.PrimeReleases;

public interface PrimeReleasesDAO {
	//insert into prime_releases (prime_id,category_id,name_of_video,genre,audio_languages,subtitle_languages,director,release_date,prime_release_date,box_office_collection_millions,casting,description_of_video) 
	//values (prime_id_seq.nextval,2,'Avengers endgame','Fantasy','English','English','Russo Brothers',to_date('01-04-2019','dd-MM-YYYY'),to_date('01-11-2019','dd-MM-YYYY'),2789,'Robert Downy JR','Marvel studios biggest movie of the era');
	void addReleaseDetails(PrimeReleases PrimeRelease);
	//select prime_id,name_of_video from prime_releases where name_of_video like %?%;
	//List<PrimeReleases> commonSearch(String search) throws Exception;
	
	//select * from prime_releases;
	List<PrimeReleases> getPrimeReleases(String videoname);
	
	//select name_of_video from prime_releases where  name_of_video like 'A%';
	String[] nameOfVideo(String Like);

	//update prime_releases set imdb_rating = 10 where prime_id = 12321;
	int addImdbRating (int primeID);
	
	//select * from prime_releases where audio_languages = 'English' order by imdb_rating desc ; 
	//List<PrimeReleases>  getAudioLanguages(String audioLanguages) throws SQLException, Exception;
	//select * from prime_releases where genre = 'Fantasy' order by imdb_rating desc;
	List<PrimeReleases>  getGenres(String genre);
	//select * from prime_releases order by release_date desc;
	List<PrimeReleases> list();
	//select * from prime_releases order by prime_release_date desc;
	List<PrimeReleases> list1() throws Exception;
	//select * from prime_releases order by imdb_rating desc;
	List<PrimeReleases> list2() throws Exception;
	
	List<PrimeReleases> list3() throws Exception;

}

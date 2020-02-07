package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class PrimeReleases {
	public int primeId;
	public int categoryId;
	public String nameofVideo;
	public String genre;
	public int season = 0;
	public int totalEpisodes = 0;
	public String audioLanguages;
	public String subtitleLanguages;
	public String director;
	public LocalDate releaseDate;
	public LocalDate primereleaseDate;
	public int boxofficecollectionuinmillions;
	public String casting;
	public String descriptionofvideo;
	public int imdbRating;
	public boolean originals;
	public PrimeReleases(int primeId, int categoryId, String nameofVideo, String genre, int season, int totalEpisodes,
			String audioLanguages, String subtitleLanguages, String director, LocalDate releaseDate,
			LocalDate primereleaseDate, int boxofficecollectionuinmillions, String casting, String descriptionofvideo,
			int imdbRating, boolean originals) {
		super();
		this.primeId = primeId;
		this.categoryId = categoryId;
		this.nameofVideo = nameofVideo;
		this.genre = genre;
		this.season = season;
		this.totalEpisodes = totalEpisodes;
		this.audioLanguages = audioLanguages;
		this.subtitleLanguages = subtitleLanguages;
		this.director = director;
		this.releaseDate = releaseDate;
		this.primereleaseDate = primereleaseDate;
		this.boxofficecollectionuinmillions = boxofficecollectionuinmillions;
		this.casting = casting;
		this.descriptionofvideo = descriptionofvideo;
		this.imdbRating = imdbRating;
		this.originals = originals;
	}
	
	public PrimeReleases() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PrimeReleases [primeId=" + primeId + ", categoryId=" + categoryId + ", nameofVideo=" + nameofVideo
				+ ", genre=" + genre + ", season=" + season + ", totalEpisodes=" + totalEpisodes + ", audioLanguages="
				+ audioLanguages + ", subtitleLanguages=" + subtitleLanguages + ", director=" + director
				+ ", releaseDate=" + releaseDate + ", primereleaseDate=" + primereleaseDate
				+ ", boxofficecollectionuinmillions=" + boxofficecollectionuinmillions + ", casting=" + casting
				+ ", descriptionofvideo=" + descriptionofvideo + ", imdbRating=" + imdbRating + ", originals="
				+ originals + "]";
	}
	
	
	

}

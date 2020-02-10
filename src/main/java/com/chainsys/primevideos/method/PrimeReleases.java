package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class PrimeReleases {
	private int primeId;
	private int categoryId;
	private String nameofVideo;
	private String genre;
	private int season = 0;
	private int totalEpisodes = 0;
	private String audioLanguages;
	private String subtitleLanguages;
	private String director;
	private LocalDate releaseDate;
	private LocalDate primereleaseDate;
	private int boxofficecollectionuinmillions;
	private String casting;
	private String descriptionofvideo;
	private int imdbRating;
	private boolean originals;
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
	}

	public String toString() {
		return "PrimeReleases \nprimeId =" + primeId + "\ncategoryId =" + categoryId + "\nnameofVideo = " + nameofVideo
				+ "\nGenre = " + genre + "\nSeason = " + season + "\nTotalEpisodes = " + totalEpisodes + "\nAudioLanguages = "
				+ audioLanguages + "\nSubtitleLanguages = " + subtitleLanguages + "\nDirector=" + director
				+ "\nReleaseDate=" + releaseDate + "\nPrimereleaseDate = " + primereleaseDate
				+ "\nBoxofficecollectionuinmillions = " + boxofficecollectionuinmillions + "\nCasting=" + casting
				+ "\nDescriptionofvideo=" + descriptionofvideo + "\nImdbRating=" + imdbRating + "\nOriginals="
				+ originals;
	}

	public int getPrimeId() {
		return primeId;
	}

	public void setPrimeId(int primeId) {
		this.primeId = primeId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getNameofVideo() {
		return nameofVideo;
	}

	public void setNameofVideo(String nameofVideo) {
		this.nameofVideo = nameofVideo;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public int getTotalEpisodes() {
		return totalEpisodes;
	}

	public void setTotalEpisodes(int totalEpisodes) {
		this.totalEpisodes = totalEpisodes;
	}

	public String getAudioLanguages() {
		return audioLanguages;
	}

	public void setAudioLanguages(String audioLanguages) {
		this.audioLanguages = audioLanguages;
	}

	public String getSubtitleLanguages() {
		return subtitleLanguages;
	}

	public void setSubtitleLanguages(String subtitleLanguages) {
		this.subtitleLanguages = subtitleLanguages;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public LocalDate getPrimereleaseDate() {
		return primereleaseDate;
	}

	public void setPrimereleaseDate(LocalDate primereleaseDate) {
		this.primereleaseDate = primereleaseDate;
	}

	public int getBoxofficecollectionuinmillions() {
		return boxofficecollectionuinmillions;
	}

	public void setBoxofficecollectionuinmillions(int boxofficecollectionuinmillions) {
		this.boxofficecollectionuinmillions = boxofficecollectionuinmillions;
	}

	public String getCasting() {
		return casting;
	}

	public void setCasting(String casting) {
		this.casting = casting;
	}

	public String getDescriptionofvideo() {
		return descriptionofvideo;
	}

	public void setDescriptionofvideo(String descriptionofvideo) {
		this.descriptionofvideo = descriptionofvideo;
	}

	public int getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(int imdbRating) {
		this.imdbRating = imdbRating;
	}

	public boolean isOriginals() {
		return originals;
	}

	public void setOriginals(boolean originals) {
		this.originals = originals;
	}
	
	
	

}

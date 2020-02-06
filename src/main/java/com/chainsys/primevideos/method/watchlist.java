package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class WatchList {
	public int userId;
	public int primeId;
	public String status = "watching";
	public int likes = 0;
	public LocalDate startedon;
	public int viewerrating;
	
	public WatchList(int userId, int primeId, String status, int likes, LocalDate startedon, int viewerrating) {
		super();
		this.userId = userId;
		this.primeId = primeId;
		this.status = status;
		this.likes = likes;
		this.startedon = startedon;
		this.viewerrating = viewerrating;
	}

	@Override
	public String toString() {
		return "watchlist [userId=" + userId + ", primeId=" + primeId + ", status=" + status + ", likes=" + likes
				+ ", startedon=" + startedon + ", viewerrating=" + viewerrating + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPrimeId() {
		return primeId;
	}

	public void setPrimeId(int primeId) {
		this.primeId = primeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public LocalDate getStartedon() {
		return startedon;
	}

	public void setStartedon(LocalDate startedon) {
		this.startedon = startedon;
	}

	public int getViewerrating() {
		return viewerrating;
	}

	public void setViewerrating(int viewerrating) {
		this.viewerrating = viewerrating;
	}

}

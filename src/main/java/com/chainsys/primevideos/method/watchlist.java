package com.chainsys.primevideos.method;

import java.time.LocalDate;

public class watchlist {
	public int userId;
	public int primeId;
	public String status = "watching";
	public int likes = 0;
	public LocalDate startedon;
	public int viewerrating;
	
	public watchlist(int userId, int primeId, String status, int likes, LocalDate startedon, int viewerrating) {
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

}

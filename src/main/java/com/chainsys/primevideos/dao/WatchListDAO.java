package com.chainsys.primevideos.dao;

import exception.DbException;

;

public interface WatchListDAO {
	
	void likes(String mailID,int primeId,int likes);
	
	void viewerRating(String mailID,int primeId,int viewerRating) throws DbException;

	boolean updateWatched(String mailId, int primeId, int decide) throws DbException;
}

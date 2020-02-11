package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.UserCredits;

import exception.DbException;

public interface UserCreditsDAO {

	void userUpdate(UserCredits users) throws DbException;


	
	List<UserCredits> list() throws DbException;
}

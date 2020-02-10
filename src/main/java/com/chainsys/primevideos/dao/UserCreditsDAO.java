package com.chainsys.primevideos.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.primevideos.method.UserCredits;

public interface UserCreditsDAO {

	void userUpdate(UserCredits users) throws Exception;

	List<UserCredits> getUserDetails();

	List<UserCredits> getUserAge(int age);
	
	ArrayList<UserCredits> list() throws SQLException, Exception;
}

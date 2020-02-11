package com.chainsys.primevideos.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.primevideos.method.UserCredits;

public interface UserCreditsDAO {

	void userUpdate(UserCredits users) throws Exception;


	
	ArrayList<UserCredits> list() throws SQLException, Exception;
}

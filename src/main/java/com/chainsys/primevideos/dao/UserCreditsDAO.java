package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.userCredits;

public interface UserCreditsDAO {

	void userUpdate(userCredits users) throws Exception;

	List<userCredits> getUserDetails();

	List<userCredits> getUserAge(int age);
}

package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.UserCredits;

public interface UserCreditsDAO {
	//insert into user_credits (customer_name,gender,DOB,age,mail_id,user_id,passwords,mobile_no) values('Rathnakumar','M',to_date('01-07-1989','dd-MM-yyyy'),31,'rathnakumar@gmail.com',user_id_seq.nextval,'asaodhasjdks',806342345);
	//void userLogin(UserCredits User) throws Exception;
	//update user_credits set((customer_name,gender,DOB,age,mail_id,passwords,mobile_no) where mail_id = ?;
	void userUpdate(UserCredits users) throws Exception;
	//select * from user_credits; 
	List<UserCredits> getUserDetails();
	//select * from user_credits where age<=25;
	List<UserCredits> getUserAge(int age);
}

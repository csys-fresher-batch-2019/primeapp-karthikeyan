package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.paymentdetails;

public interface paymentdetailsdao {
	//insert into payment_details (user_id,passwords,card_category,name_on_card,card_no,date_of_expire)
	//values (12346812,'asaodhasjdks','visa','Rathnakumar',1234567812345678,'3-2023');
	void addPaymentDetails(paymentdetails payments);
	//select * from payment_details;
	List<paymentdetails> getPaymentsDetails();
	//select * from payment_details where card_category='visa';
	List<paymentdetails> getPaymentsDetails(String cardCategoty);
	

}

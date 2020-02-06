package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.PaymentDetails;

public interface PaymentDetailsDAO {
	//insert into payment_details (user_id,passwords,card_category,name_on_card,card_no,date_of_expire)
	//values (12346812,'asaodhasjdks','visa','Rathnakumar',1234567812345678,'3-2023');
	void addPaymentDetails(PaymentDetails payments);
	//select * from payment_details;
	List<PaymentDetails> getPaymentsDetails();
	//select * from payment_details where card_category='visa';
	List<PaymentDetails> getPaymentsDetails(String cardCategoty);
	

}

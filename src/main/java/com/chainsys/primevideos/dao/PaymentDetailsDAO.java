package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.PaymentDetails;

public interface PaymentDetailsDAO {
	void addPaymentDetails(PaymentDetails payments);

	List<PaymentDetails> getPaymentsDetails();

	List<PaymentDetails> getPaymentsDetails(String cardCategoty);
	

}

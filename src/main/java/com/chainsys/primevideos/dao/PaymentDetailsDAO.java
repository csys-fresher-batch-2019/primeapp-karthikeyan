package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.PaymentDetails;

public interface PaymentDetailsDAO {
	void addPaymentDetails(PaymentDetails payments) throws Exception;

	List<PaymentDetails> getPaymentsDetails() throws Exception;

	List<PaymentDetails> getPaymentsDetails(String cardCategoty) throws Exception;
	

}

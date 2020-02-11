package com.chainsys.primevideos.dao;

import java.util.List;

import com.chainsys.primevideos.method.PaymentDetails;

import exception.DbException;

public interface PaymentDetailsDAO {
	void addPaymentDetails(PaymentDetails payments) throws DbException;

	List<PaymentDetails> getPaymentsDetails() throws DbException;

	List<PaymentDetails> getPaymentsDetails(String cardCategoty) throws DbException;
	

}

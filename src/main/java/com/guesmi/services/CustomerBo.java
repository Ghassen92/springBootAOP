package com.guesmi.services;

public interface CustomerBo {

	void addCustomer();

	String addCustomerReturnValue(String name);

	void addCustomerThrowException() throws Exception;

	void addCustomerAround(String name);
}
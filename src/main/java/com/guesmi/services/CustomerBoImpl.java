package com.guesmi.services;

import org.springframework.stereotype.Service;

@Service
public class CustomerBoImpl implements CustomerBo {
	
	@Override
	public void addCustomer() {
		System.out.println("addCustomer() is running ");
	}

	@Override
	public String addCustomerReturnValue(String name) {
		System.out.println("addCustomerReturnValue() is running ");
		return name+"returned";
	}

	@Override
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	@Override
	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}

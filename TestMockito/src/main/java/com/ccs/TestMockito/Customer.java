package com.ccs.TestMockito;

public class Customer {

	CustomerService customer;
	
	public Customer(CustomerService service) {
		this.customer = service;
	}

	public String getName(String code) {
		String name = null;
		try {
			name = customer.getName(code);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return name;
	}

	
}

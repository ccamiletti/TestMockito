package com.ccs.TestMockito;

public class Calculator {

	public CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service = service;
	}
	
	
	public int perform(int i, int j) {
		int resp = this.service.add(i, j);
		
		System.out.println("resp = " + resp);
		
		return resp;
		
	}
}

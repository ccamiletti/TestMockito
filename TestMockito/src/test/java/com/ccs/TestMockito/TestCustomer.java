package com.ccs.TestMockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestCustomer {

	@Mock
	CustomerService customerService;
	
	Customer customer = null;
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule(); 

	@Before
	public void init() {

		customer = new Customer(customerService);
		when(customerService.getName("007")).thenReturn("camiletti");
	}
	
	@Test
	public void testPerform() {
		
		try {
			assertEquals("camiletti", customer.getName("007"));
			verify(customerService).getName("007");
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
	}
	

}

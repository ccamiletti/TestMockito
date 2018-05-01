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





public class TestCalculator {

	Calculator c = null;
	
	//CalculatorService service = mock(CalculatorService.class) is replaced to @Mock;
	@Mock
	CalculatorService calculatorService;

	@Rule
	public MockitoRule rule = MockitoJUnit.rule(); 
	
	@Before
	public void setUp() {

		c = new Calculator(calculatorService);
		when(calculatorService.add(2,6)).thenReturn(10);

	}

	
	
	@Test
	public void testPerform() {
		
		try {
			assertEquals(10, c.perform(2, 6));
			verify(calculatorService).add(2, 6);
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
	}
	
}

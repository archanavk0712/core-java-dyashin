package com.dyashin.junittesting;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.dyashin.junittesting.mockito.CalculatorAdd;
import com.dyashin.junittesting.mockito.MathService;

@RunWith(MockitoJUnitRunner.class)
public class TestCal {

	//Create a mock object of MathService
	@Mock
	private MathService mathService;
	
	//Automatically injects mock into Calculator
	@InjectMocks
	private CalculatorAdd calculatorAdd;
	
	@Test
	public void testPerformAddition() {
		 
		when(mathService.add(1, 2)).thenReturn(3);
		
		//Act: call method under test
		int result=calculatorAdd.performAddition(1,2);
		
		//Assert: validate output
		assertEquals(3, result);
		
		//Verify dependency method was called
		verify(mathService).add(1, 2);
	}

}

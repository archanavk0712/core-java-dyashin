package com.dyashin.junittesting.mockito;

public class CalculatorAdd {
	private MathService mathService;

	public CalculatorAdd(MathService mathService) {
		super();
		this.mathService = mathService;
	}
	
	public int performAddition(int a, int b) {
		return mathService.add(a, b);
	}
}

package com.logicoy.monitor.cal;

/**
 * 
 * @author Amar
 *
 */
public class CalculatorImpl implements Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) throws Exception {
		if(b == 0) {
			throw new Exception("Divider can't be zero");
		}
		return a / b;
	}

	public boolean equalIntegers(int a, int b) {
		boolean result = false;
		if(a == b) {
			return true;
		}
		return result;
	}

}

package com.logicoy.monitor.cal;

/**
 * 
 * @author Amar
 *
 */
public interface Calculator {

	int sum(int a, int b);
	
	int sub(int a, int b);
	
	int multiplication(int a, int b);
	
	int division(int a, int b) throws Exception;
	
	boolean equalIntegers(int a, int b);
	
}

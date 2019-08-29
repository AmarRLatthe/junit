package com.logicoy.monitor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.logicoy.monitor.cal.CalculatorImpl;

public class CalculatorTest {

	private static CalculatorImpl calculatorImpl;
	
	@BeforeClass
	public static void initCalculator() {
		calculatorImpl = new CalculatorImpl();
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each test");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("This is executed after each test");
	}
	
	@Test
	public void testSum() {
		int result = calculatorImpl.sum(3, 4);
		 
        assertEquals(7, result);
    }
 
    @Test
    public void testDivison() {
        try {
            int result = calculatorImpl.division(10, 2);
 
            assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
 
    @Test(expected = Exception.class)
    public void testDivisionException() throws Exception {
    	calculatorImpl.division(10, 0);
    }
 
    @Ignore
    @Test
    public void testEqual() {
        boolean result = calculatorImpl.equalIntegers(20, 20);
 
        assertFalse(result);
    }
 
    @Ignore
    @Test
    public void testSubstraction() {
        int result = 10 - 3;
 
        assertTrue(result == 9);
    }
}

package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void divideTest() {
		JUnit1 j=new JUnit1();
		int actual=j.add(1, 2);
		int expected=4;
//		assertEquals(Double.POSITIVE_INFINITY, j.divide(12.0, 3.0));
		assertThrows;
	}
	@Test
	void addTest() {
		JUnit1 j=new JUnit1();
		int actual=j.add(1, 2);
		int expected=3;
		assertEquals(expected, actual,"apni add korte paren na");	
	}
	@Test
	void truTest() {
		JUnit1 j=new JUnit1();
		int actual=j.add(1, 2);
		int expected=3;
		assertTrue(j.isEven(3));
		
	}
	@Test
	void arrayTest() {
		int[] a= {1,2};
		int[] b= {1,2};
		assertArrayEquals(a,b);	
	}

}
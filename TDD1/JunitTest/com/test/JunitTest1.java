package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS) //Only ONE object of the test class is created. All test methods share the same instance.

class JunitTest1 {
	Junit j=new Junit();
	@BeforeEach
	public void bef() {
		System.out.println("before each");
	}
	
	@AfterEach
	public void aft() {
		System.out.println("after each");
	}
	@BeforeAll
	public void start() {
		System.out.println("before all");
	}
	@AfterAll
	public void end() {
		System.out.println("after all");
	}
	@Test
	void test() {
		assertEquals("olleh",j.rev("hello"));
	}
	@Test
	void exceptionTest() {
		try {
			int[] arr=null;
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		}
		catch(NullPointerException e) {
			System.out.println("handled");
		}
	}
	

}

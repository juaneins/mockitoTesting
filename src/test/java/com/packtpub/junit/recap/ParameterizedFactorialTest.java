package com.packtpub.junit.recap;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedFactorialTest {
	
	private int number;
	private int expectedResult;
	
	public ParameterizedFactorialTest(int input, int expected) {
		number = input;
		expectedResult = expected;
	}

	@Parameters
	public static Collection<Object[]> factorialData() {
		return Arrays
				.asList(new Object[][] { 
					{ 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, 
					{ 4, 24 }, { 5, 120 }, { 6, 720 } 
		});
	}
	
	@Test
	public void factorial() { 
		Factorial fact = new Factorial();
		assertEquals(fact.factorial(number), expectedResult);
	}

}

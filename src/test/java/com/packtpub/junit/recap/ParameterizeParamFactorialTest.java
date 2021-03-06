package com.packtpub.junit.recap;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
//import com.packtpub.junit.recap.Factorial;

@RunWith(Parameterized.class)
public class ParameterizeParamFactorialTest {

	public int number;
	public int expectedResult;

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

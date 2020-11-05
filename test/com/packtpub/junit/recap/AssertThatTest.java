package com.packtpub.junit.recap;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;


public class AssertThatTest {
	
	@Test
	public void verifyMatcher() {
		int age = 30;
		assertThat(age, equalTo(30));
		assertThat(age, is(30));
		
		assertThat(age, not(equalTo(33)));
		assertThat(age, is(not(33)));
	}

}


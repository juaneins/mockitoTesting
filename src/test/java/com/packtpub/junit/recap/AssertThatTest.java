package com.packtpub.junit.recap;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static com.packtpub.junit.recap.LessThanOrEqual.lessThanOrEqual;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;;

public class AssertThatTest {

	@Test
	public void verifyMatcherValues() {
		int age = 30;
		assertThat(age, equalTo(30));
		assertThat(age, is(30));

		assertThat(age, not(equalTo(33)));
		assertThat(age, is(not(33)));
	}

	@Test
	public void verifyMultipleValues() {
		double marks = 100.00;
		assertThat(marks, either(is(100.00)).or(is(90.9)));
		assertThat(marks, both(not(99.99)).and(not(60.00)));
		assertThat(marks, anyOf(is(100.00), is(1.00), is(55.00), is(88.00), is(67.8)));
		assertThat(marks, not(anyOf(is(0.00), is(200.00))));
		assertThat(marks, not(allOf(is(1.00), is(100.00), is(30.00))));

	}
	
	@Test
	public void verifyCollectionValues() {
		List<Double> salary = Arrays.asList(50.0,200.0,500.0);
		assertThat(salary, hasItem(500.0));
		assertThat(salary, hasItems(500.0,50.0));
		assertThat(salary, not(hasItem(500.3)));
	}
	
	@Test
	public void verifyStrings() {
		String name = "John Jr Dale";
		assertThat(name, startsWith("John"));
		assertThat(name, endsWith("Dale"));
		assertThat(name, containsString("Jr"));
	}
	
	@Test
	public void lessthanOrEqualsCustomMatcher() {
		int actualGoalScored = 2;
		assertThat(actualGoalScored, lessThanOrEqual(2));
		assertThat(actualGoalScored, lessThanOrEqual(4));
		
		double originalPI = 3.14;
		assertThat(originalPI, lessThanOrEqual(9.00));
		
		String authorName = "Sujoy";
		assertThat(authorName, lessThanOrEqual("Zachary"));
	}

}

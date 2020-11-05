/**
 * 
 */
package com.packtpub.junit.recap;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * @author juaneins_uio
 *
 */
public class AssertTest {

	@Test
	public void assertTrueAndFalseTest() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
	
	@Test
	public void assertNullAndNotNullTest() {
		Object myObject = null;
		Assert.assertNull(myObject);
		
		
		myObject = new String("Some value");
		Assert.assertNotNull(myObject);
	}
	@Test
	public void assertEqualsTest() { 
		Integer i = Integer.parseInt("5");
		Integer j = Integer.parseInt("5");
		assertEquals(i, j);
	}
	
	@Test
	public void assertNotSameTest() {
		Integer i = Integer.parseInt("5");
		Integer j = Integer.valueOf("6");
		assertNotSame(i, j);
	}
	
	@Test
	public void assertSameTest() {
		Integer i = Integer.parseInt("5");
		Integer j = Integer.valueOf("5");
		assertSame(i, j);
	}
	
	@Test
	@Ignore("John's holiday stuff failing")
	public void when_today_is_holiday_then_stop_alarm() {
	}

}

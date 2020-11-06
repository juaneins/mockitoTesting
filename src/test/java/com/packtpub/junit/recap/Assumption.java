/**
 * 
 */
package com.packtpub.junit.recap;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.Test;

/**
 * @author juaneins_uio
 *
 */
public class Assumption {
	
	boolean isSonarRunning = false;

	@Test
	public void veryCriticalTest() {
		isSonarRunning = false;
		Assume.assumeFalse(isSonarRunning);
		assertTrue(true);
	}
}

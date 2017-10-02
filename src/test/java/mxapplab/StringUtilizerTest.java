package mxapplab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mxapplab.StringUtilizer;

public class StringUtilizerTest {

	@Test
	public void toInitialNaming_when_singlename() {
		StringUtilizer strUtil = new StringUtilizer();
		String actual = strUtil.toInitialNaming("jane");
		String excepted = "J.";
		assertTrue(actual.equals(excepted));
	}
	
	@Test
	public void toInitialNaming_should_fullname() {
		StringUtilizer strUtil = new StringUtilizer();
		String actual = strUtil.toInitialNaming("jane austen");
		String excepted = "J. Austen";
		assertTrue(actual.equals(excepted));
	}
	
	@Test
	public void toInitialNaming_should_fullname_when_morethan_twonames() {
		StringUtilizer strUtil = new StringUtilizer();
		String actual = strUtil.toInitialNaming("miss jane austen");
		String excepted = "M. J. Austen";
		assertTrue(actual.equals(excepted));
	}
}

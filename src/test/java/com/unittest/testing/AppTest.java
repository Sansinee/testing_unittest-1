package com.unittest.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
	Fahrenheit object;
	@Before
	public void newClassfahrenheit() {
		object = new Fahrenheit();
	}
	@Test
	public void testResult0input0() {
		double input = 0;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual, 2);
	}
	@Test
	public void testResult1000input1000() {
		double input = 1000;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual, 2);
	}
	@Test
	public void testResultMinus1000inputMinus1000() {
		double input = -1000;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual, 2);
	}
	@Test
	public void testResultTrueinput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
}
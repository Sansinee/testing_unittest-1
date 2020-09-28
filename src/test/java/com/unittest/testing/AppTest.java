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
	public void testResult0iInput0() {
		double input = 0;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult1000Input1000() {
		double input = 1000;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResultMinus1000InputMinus1000() {
		double input = -1000;
		double expected =-1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test //1//
	public void testResultTrueinput1() {
		double input = 1;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput1() {
		double input =-1;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}

	@Test //0//
	public void testResultTrunInput0() {
		double input = 0;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test //499//
	public void testResultTrunInput499(){
		double input = 499;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput499() {
		double input =-499;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test //500//
	public void testResultTrunInput500(){
		double input = 500;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput500() {
		double input =-500;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test //501//
	public void testResultTrunInput501(){
		double input = 501;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput501() {
		double input =-501;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test //999//
	public void testResultTrunInput999(){
		double input = 999;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInpu999() {
		double input =-999;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test //1000//
	public void testResultTrunInput1000(){
		double input = 1000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput1000(){
		double input =-1000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}	
	@Test //1001//
	public void testResultTrunInput1001(){
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput1001(){
		double input =-1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test //1010//
	public void testResultTrunInput1010(){
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput1010(){
		double input =-1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}	
	@Test //2000//
	public void testResultTrunInput2000(){
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrunMinusInput2000(){
		double input =-2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}

	
	
	
}
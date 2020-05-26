package com.harithas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.harithas.MainJava;

public class TestFile {

	@Test
	public void test1() {
		MainJava mj = new MainJava();
		assertEquals(true, mj.LeapYear(2000));
		
	}
	
	
	@Test
	public void test2() {
		MainJava mj = new MainJava();
		assertEquals(false, mj.LeapYear(1800));
		
	}
	
	
	
	@Test
	public void test3() {
		MainJava mj = new MainJava();
		assertEquals(false, mj.LeapYear(1700));
		
	}
	
	@Test
	public void test4() {
		MainJava mj = new MainJava();
		assertEquals(false, mj.LeapYear(1900));
		
	}
	
	
	@Test
	public void test5() {
		MainJava mj = new MainJava();
		assertEquals(false, mj.LeapYear(2100));
		
	}
	
	@Test
	public void test6() {
		MainJava mj = new MainJava();
		assertEquals(true, mj.LeapYear(2008));
		
	}
	
	@Test
	public void test7() {
		MainJava mj = new MainJava();
		assertEquals(true, mj.LeapYear(2012));
		
	}
	
	@Test
	public void test8() {
		MainJava mj = new MainJava();
		assertEquals(true, mj.LeapYear(2016));
		
	}
	
	@Test
	public void test9() {
		MainJava mj = new MainJava();
		assertEquals(false, mj.LeapYear(2017));
		
	}
	
	@Test
	public void test10() {
		MainJava mj = new MainJava();
		assertEquals(false, mj.LeapYear(2018));
		
	}
	
	@Test
	public void test11() {
		MainJava mj = new MainJava();
		assertEquals(false, mj.LeapYear(2019));
		
	}
	
	

}

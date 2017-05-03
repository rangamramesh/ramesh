package com.bicycle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicycleTestcase {
	Bicycle bicycle = null;

	@Before
	public void setUp() throws Exception {
		bicycle = new Bicycle();
	}

	@Test
	public void test1() {
		bicycle = new Bicycle(0);
		bicycle.increseSpeed();
		assertEquals(bicycle.state, true);
		bicycle.decreseSpeed();
		assertEquals(bicycle.state, false);
	}

	@Test
	public void test2() {
		bicycle = new Bicycle(1);
		bicycle.decreseSpeed();
		assertEquals(bicycle.state, false);
		bicycle.increseSpeed();
		assertEquals(bicycle.state, true);
	}
	@Test
	public void test3() {
		bicycle = new Bicycle(-5);
		bicycle.decreseSpeed();
		assertEquals(bicycle.state, false);
		
	}
	
	@Test
	public void test4() {
		bicycle = new Bicycle(-5);
		bicycle.decreseSpeed();
		assertEquals(0,bicycle.currentSpeed);
		
	}
	@Test
	public void test5() {
		bicycle = new Bicycle(-5);
		bicycle.decreseSpeed();
		bicycle.decreseSpeed();
		bicycle.increseSpeed();
		bicycle.increseSpeed();
		assertEquals(2,bicycle.currentSpeed);
		
	}

}

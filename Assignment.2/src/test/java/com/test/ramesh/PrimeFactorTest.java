package com.test.ramesh;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.ramesh.PrimeFactor;

public class PrimeFactorTest {
	PrimeFactor pf=null;

	@Before
	public void setUp() throws Exception {
		pf=new PrimeFactor();
	}

	@Test
	public void PrimeFactTest() {
	String Result=pf.primeFactors(564);
	assertEquals("2 3 47 ",Result);
	}
	@Test
	public void PrimeFact_zeroTest() {
	String Result=pf.primeFactors(0);
	assertEquals("You have Entered Zero",Result);
	}
	@Test
	public void PrimeFact_oneTest() {
	String Result=pf.primeFactors(1);
	assertEquals("you have Entered 1 there is no Prime Factors",Result);
	}
	

}

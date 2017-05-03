package com.biquadratic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BiQuadraticTest {
	BiQuadratic biQuadratic =null;
	@Before
	public void setUp() throws Exception {
		biQuadratic =new BiQuadratic();
	}

	@Test
	public void test1() {
		quad p =biQuadratic.solveBiQuadratic(1, -13,36);
		assertEquals("(3.0,-3.0,2.0,-2.0)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test2() {
		quad p =biQuadratic.solveBiQuadratic(1, 2,3);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test3() {
		quad p =biQuadratic.solveBiQuadratic(5,8,2);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test4() {
		quad p =biQuadratic.solveBiQuadratic(5,-8,2);
		assertEquals("(1.1357367426286056,-1.1357367426286056,0.5568680736434478,-0.5568680736434478)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	@Test
	public void test5() {
		quad p =biQuadratic.solveBiQuadratic(5,-8,0);
		assertEquals("(1.2649110640673518,-1.2649110640673518,0.0,-0.0)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test6() {
		quad p =biQuadratic.solveBiQuadratic(1,5,6);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test7() {
		quad p =biQuadratic.solveBiQuadratic(0,0,0);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
	
	
	@Test
	public void test8() {
		quad p =biQuadratic.solveBiQuadratic(-3,-4,-2);
		assertEquals("(NaN,NaN,NaN,NaN)","("+p.getX1()+","+p.getX2()+","+p.getX3()+","+p.getX4()+")");
	}
}

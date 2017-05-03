package com.quadratic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuadraticTest {
	Quadratic quadratic =null;
	@Before
	public void setUp() throws Exception {
		quadratic =new Quadratic();
	}

	@Test
	public void test1() {
		Pair p=quadratic.solveQuadratic(1, 4, 2);
		assertEquals("(-0.5857864376269049,-3.414213562373095)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test2() {
		Pair p=quadratic.solveQuadratic(5,8,2);
		assertEquals("(-0.31010205144336445,-1.2898979485566355)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test3() {
		Pair p=quadratic.solveQuadratic(5,-8,2);
		assertEquals("(1.2898979485566355,0.31010205144336445)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test4() {
		Pair p=quadratic.solveQuadratic(5,-8,0);
		assertEquals("(1.6,0.0)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test5() {
		Pair p=quadratic.solveQuadratic(-9,8,0);
		assertEquals("(-0.0,0.8888888888888888)","("+p.getX()+","+p.getY()+")");
	}
	@Test
	public void test6() {
		Pair p=quadratic.solveQuadratic(1,1,1);
		assertEquals("(NaN,NaN)","("+p.getX()+","+p.getY()+")");
	}

}

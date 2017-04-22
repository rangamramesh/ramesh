package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.BalancingExpression;

public class BalancingExpressionTest {

	@Test
	public void test() {
		BalancingExpression be=new BalancingExpression();
		boolean result=be.balancing("{(wd,ss)}");
		assertEquals(true,result);
		
	}
	@Test
	public void test2() {
		BalancingExpression be=new BalancingExpression();
		boolean result=be.balancing("{{(kw},)}}))w");
		assertEquals(false,result);
		
	}
	@Test
	public void test3() {
		BalancingExpression be=new BalancingExpression();
		boolean result=be.balancing("{((a,e,y,wt,b))}");
		assertEquals(true,result);
		
	}

}

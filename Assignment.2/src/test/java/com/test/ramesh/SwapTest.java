package com.test.ramesh;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.ramesh.Swap;

public class SwapTest {
 Swap obj=null;
 
	@Before
	public void setup(){
	 obj=new Swap();
	}
	@Test
	public void swappositive_test() {
	String result=obj.swap(55, 65);
	assertEquals("65 55",result);
	}
	@Test
	public void swapnegative_test() {
	String result=obj.swap(-23, -63);
	assertEquals("-63 -23",result);
	}
	@Test
	public void swapzero_test() {
	String result=obj.swap(0,0 );
	assertEquals("You entered numbers are zero",result);
	}
	@Test
	public void swapequal_test() {
	String result=obj.swap(22,22 );
	assertEquals("you Entered equal numbers",result);
	}
}

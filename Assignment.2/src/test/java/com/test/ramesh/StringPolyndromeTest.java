package com.test.ramesh;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.ramesh.StringPolyndrome;

public class StringPolyndromeTest {
	StringPolyndrome sp=null;
	@Before
	public void setUp() throws Exception {
		sp=new StringPolyndrome();
	}

	@Test
	public void StringPolyndTest() {
		assertEquals(false,StringPolyndrome.isPolyndrome("ramajhbjgj"));
		assertEquals(true,StringPolyndrome.isPolyndrome("madam"));
		assertTrue("yes this is plyndrome",StringPolyndrome.isPolyndrome("madam"));
		assertFalse("You not Entered String",StringPolyndrome.isPolyndrome("ramajhbjgj"));
		
	}

}

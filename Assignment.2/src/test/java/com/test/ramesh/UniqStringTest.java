package com.test.ramesh;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.ramesh.UniqString;

public class UniqStringTest {
	UniqString us=null;
	@Before
	public void setup(){
		us=new UniqString();
	}

	@Test
	public void UniqsStringTest() {
		String Result=UniqString.doUniq("ramana");
		assertEquals("ramn",Result);
	}
	@Test
	public void UniqString_NullTest() {
		String Result=UniqString.doUniq(null);
		assertEquals("String was not Entered",Result);
	}

}

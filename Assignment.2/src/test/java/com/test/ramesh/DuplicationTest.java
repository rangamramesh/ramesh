package com.test.ramesh;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.ramesh.DuplicatArray;

public class DuplicationTest {
	

	@Test
	public void duplicationTest() {
		DuplicatArray dp=new DuplicatArray();
		int [] a={7, 3, 21, 7, 34, 18, 3, 21};
		String b=dp.duplicate(a);
		assertEquals("7 3 21 34 18 ",b);
	}

}

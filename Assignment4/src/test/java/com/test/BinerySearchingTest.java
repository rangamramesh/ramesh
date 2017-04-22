package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.main.BinerySearching;

public class BinerySearchingTest {
	BinerySearching binerySearching=null;
	@Before
	public void setUp() throws Exception {
		binerySearching=new BinerySearching();
	}

	@Test
	public void binerySearching_test() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(8,binerySearching.binerySearch(array,15));
	}
	@Test
	public void binerySearching_nottest() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(-1,binerySearching.binerySearch(array,25));
	}
}

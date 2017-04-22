package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.InsertionSort;

public class InsertionTest {
	static InsertionSort insertionSort=null;
	@Before
	public void setUp() throws Exception {
		insertionSort=new InsertionSort();
	}

	@Test
	public void insertion_test() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals("1 2 4 5 6 6 7 9 10 11 15 ",InsertionSort.insertionSorting(array));
	}
	@Test
	public void insertion_nulltest() {
		int array[]={};
		assertEquals("Array Elements are not Entered",InsertionSort.insertionSorting(array));
	}
	@Test
	public void insertion_negtivetest() {
		int array[]={2,6,4,-7,-9,5,1,-6,15,-11,10};
		assertEquals("you have Entered -ve values",InsertionSort.insertionSorting(array));
	}

}

package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.main.SelectionSort;

public class SelectionSortTest {
	SelectionSort selectionSort=null;
	@Before
	public void setUp() throws Exception {
		selectionSort=new SelectionSort();
	}

	@Test
	public void selectionSort_test() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals("1 2 4 5 6 6 7 9 10 11 15 ",selectionSort.selectionSorting(array));
	}
	@Test
	public void selectionSort_nulltest() {
		int array[]={};
		assertEquals("Array Elements are not Entered",selectionSort.selectionSorting(array));
	}
	@Test
	public void selectionSort_negtivetest() {
		int array[]={2,6,4,-7,-9,5,1,-6,15,-11,10};
		assertEquals("you have Entered -ve values",selectionSort.selectionSorting(array));
	}

}

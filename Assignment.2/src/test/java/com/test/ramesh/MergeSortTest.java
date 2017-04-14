package com.test.ramesh;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.main.ramesh.MergeSort;

public class MergeSortTest {
	ArrayList<Integer> Tst;
	ArrayList<Integer> al1=null;
	@Before
	public void setUp()
	{
		Tst=new ArrayList<Integer>();
	}
	@Test
	public void test() {
		 MergeSort ms=new  MergeSort();
		  al1=ms.mergSort(new int[] {1,4,6,8,11,12}, new int[]{9,10,13,16});
		  Tst.add(1);
		  Tst.add(4);
		  Tst.add(6);
		  Tst.add(8);
		  Tst.add(9);
		  Tst.add(10);
		  Tst.add(11);
		  Tst.add(12);
		  Tst.add(13);
		  Tst.add(16);
		   assertTrue(al1.equals(Tst));
		 
				 
		 
	}

}

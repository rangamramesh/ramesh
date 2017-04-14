package com.test.ramesh;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import com.main.ramesh.MissingNumber;

public class MissingNumberTest {

	LinkedList<Integer> al2;
	LinkedList<Integer> al1=null;
	@Before
	public void setUp()
	{
		al2=new LinkedList<Integer>();
	}
	@Test
	public void test() {
		MissingNumber mn=new MissingNumber();
		al1= mn.findMissingNumbers(new int[]{10,2,6,9});
	    al2.add(3);
		al2.add(4);
		al2.add(5);
		al2.add(7);
		al2.add(8);
		assertTrue(al2.equals(al1));
	}

}

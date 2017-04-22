package com.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.main.ReverseList;

public class ListReverseTest {

	@Test
	public void test() {
		ReverseList lr=new ReverseList();
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(5);
		al.add(9);
		al.add(16);
		al.add(20);
		al.add(99);
		al.add(22);
		ArrayList<Object>al2=lr.listOperations(al);
		ArrayList<Object> al3=new ArrayList<Object>();
		al3.add(22);
		al3.add(99);
		al3.add(20);
		al3.add(16);
		al3.add(9);
		al3.add(5);
		assertTrue(al3.equals(al2));
	}

}

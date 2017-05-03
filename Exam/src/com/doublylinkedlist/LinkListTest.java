package com.doublylinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class LinkListTest {
    LinkList linkList = null;
    LinkList lt1=null;
	@Before
	public void setUp() throws Exception {
    	linkList=new LinkList();
    	lt1=new LinkList();
	}

	@Test
	public void testAddfront() {
		linkList.addfront(10);
		linkList.addfront(15);
		linkList.addfront(25);
		linkList.addfront(65);
		linkList.addfront(12);
		linkList.addfront(60);
		linkList.addfront(12);
		assertEquals("[12 60 12 65 25 15 10 ]",linkList.toString());
			}


	@Test
	public void testAddNext() {
		lt1.addNext(12);
		lt1.addNext(16);
		lt1.addNext(19);
		lt1.addNext(22);
		lt1.addNext(25);
		lt1.addNext(27);
		lt1.addNext(18);
		lt1.addNext(23);
		assertEquals("[12 16 19 22 25 27 18 23 ]",lt1.toString());
		}
	
	@Test
	public void testRemoveFront() {
		lt1.addNext(12);
		lt1.addNext(16);
		lt1.addNext(19);
		lt1.addNext(22);
		lt1.addNext(25);
		lt1.addNext(27);
		lt1.addNext(18);
		lt1.addNext(23);
		lt1.removeFront();
		assertEquals("[16 19 22 25 27 18 23 ]",lt1.toString());
		
	}
    @Test
	public void testRemoveEnd() {
    	lt1.addNext(12);
		lt1.addNext(16);
		lt1.addNext(19);
		lt1.addNext(22);
		lt1.addNext(25);
		lt1.addNext(27);
		lt1.addNext(18);
		lt1.addNext(23);
	   lt1.removeEnd();
	   assertEquals("[12 16 19 22 25 27 18 ]",lt1.toString());
	}
 

	@Test
	public void testInsertAT() {
		lt1.addNext(12);
		lt1.addNext(16);
		lt1.addNext(19);
		lt1.addNext(22);
		lt1.addNext(25);
		lt1.addNext(27);
		lt1.addNext(18);
		lt1.addNext(23);
		lt1.insertAT(85, 3);
		assertEquals("[12 16 85 19 22 25 27 18 23 ]",lt1.toString());
	}

	@Test
	public void testRemoveAt() {
		lt1.addNext(12);
		lt1.addNext(16);
		lt1.addNext(19);
		lt1.addNext(22);
		lt1.addNext(25);
		lt1.addNext(27);
		lt1.addNext(18);
		lt1.addNext(23);
		lt1.removeAt(2);
		assertEquals("[12 19 22 25 27 18 23 ]",lt1.toString());
	}

}

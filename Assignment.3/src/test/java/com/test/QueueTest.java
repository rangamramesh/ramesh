package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.Queue;


public class QueueTest {

	@Test
	public void isEmptyTest() {
		Queue q=new Queue(10);
		q.enQueue('i');
		boolean result=q.isEmpty();
		assertEquals(false,result);
		
	}
	@Test
	public void deQueueTest() {
		Queue q=new Queue(10);
		q.enQueue('i');
		q.enQueue('f');
		Object result=q.deQueue();
		assertEquals('i',result);
		
	}
	
	@Test
	public void displayTest() {
		Queue q=new Queue(10);
		q.enQueue('i');
		q.enQueue('f');
		String result=q.display();
		assertEquals("[i,f,]",result);
		
	}
	@Test
	public void sizeTest() {
		Queue q=new Queue(10);
		int result=q.size();
		assertEquals(10,result);
		
	}

}

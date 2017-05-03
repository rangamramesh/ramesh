package com.doublylinkedlist;

public class Link {
  
	
	public int data;
	public Link previus;
	public Link next;
	
	public Link( Link previus,int data, Link next) {
		super();
		this.data = data;
		this.previus = previus;
		this.next = next;
	}
	
}

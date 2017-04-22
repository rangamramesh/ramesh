package com.main;

public class Stack{
	int size;
    Object stack[];
	int top=-1;
	public Stack(int s)
	{
		size=s;
		stack=new Object[s];
	}
	public void push(Object item)
	{
		if(top==size-1)
			System.out.println("stack is full");
		else
		{
			top++;
		stack[top]=item;
		}
		
	}
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("there is no elements in stack");
		return -1;
		}
		else
		{
			//System.out.println("element deleted is:"+stack[top]);
			top--;
			return stack[top+1];
		}
			
	}
	public String display()
	{
		if(top==-1)
		return "[]";
		String s="[";
		for(int i=top;i>=0;i--)
			s=s+String.valueOf(stack[i])+",";
		s=s+"]";
		return s;
			
	}
	
public boolean isEmpty()
{
	if(top==-1)
		return true;
	else
		return false;
}
 public int size()
 {
	 return size;
 }

	
}


package com.main;

public class ArrayListExample {
	Object arr[];
	int i=-1;
	int size;
	int check=0;
	public ArrayListExample(int s)
	{
		size=s;
		arr=new Object[s];
	}
	
	public void add(Object element)
	{
		if(i==size-1)
			System.out.println("can't insert more objects");
		else
		{
		    i++;
			arr[i]=element;
			
			check++;
		}
	}
	
	public int getIndexOf(Object element)
	{ 
		int count=-1;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==element)
			{
			 count++;
	         break;
			}
		if(count!=-1)
			return i;
		else
			return count;
	}
	
	public Object get(int index)
	{
		return arr[index];
	}
	
	public boolean contains(Object element)
	{
	for(Object o:arr)
		if(o==element)
			return true;
	return false;
    }
	
	public void delete(Object element)
	{
		for(int i=0;i<arr.length;i++)
		 if(arr[i]==element)
		 {
			 arr[i]=null;
			 check--;
		 }
		
	}
	
	
	
	public int size()
	{
		return check;
	}
	
	public String display()
	{
		String s="[";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				s=s+arr[i]+" ";
			}
	     }
		s=s+']';
		return s;
	}
	
	public boolean isEmpty()
	{
		if(check==0)
			return true;
		return false;
		
	}
	
	
}

package com.main;

import java.util.ArrayList;

public class ReverseList 
{
	public ArrayList<Object> listOperations(ArrayList<Object> normallist)
	{
    
	ArrayList<Object> reverslist=new ArrayList<Object>();
	for(int j=normallist.size()-1;j>=0;j--)
		{
		reverslist.add(normallist.get(j));
		}
	return reverslist;	
	}
}

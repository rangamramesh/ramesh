package com.main.ramesh;

import java.util.ArrayList;

public class MergeSort {
	public ArrayList<Integer> mergSort(int[] a1,int[] a2)
	{
		int i=0,j=0;
		ArrayList<Integer> merge=new ArrayList<Integer>();
		
	   while(i<a1.length&&j<a2.length)
	   {
		   if(a1[i]<a2[j])
		   {
			   merge.add(a1[i]);
			   i++;
		   }
		   else
		   {
			   merge.add(a2[j]);
			   j++;
			}
			   
	  }
	   while(i<a1.length)
	   {
		   merge.add(a1[i]);
		   i++;
	   }
	   while(j<a2.length)
	   {
		   merge.add(a2[j]);
		   j++;
	   }
	   System.out.println(merge);
	   return merge;
	
			   
			   }

}

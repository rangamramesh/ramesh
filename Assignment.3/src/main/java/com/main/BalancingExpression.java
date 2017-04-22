package com.main;

public class BalancingExpression {

	 public boolean balancing(String s)
	 {
		 char arr[]=new char[s.length()];
		
		 int j=-1;
		 for(int i = 0; i < arr.length; i++)
		 {
	            char c = s.charAt(i);
	            if(c == '[' || c == '(' || c == '{' ) 
	            {
	            j++;
                arr[j]=c;
                }
	            else if(c==']')
	             {
	             if(j==-1)
	             return false;
	             else if(arr[j]!=']')
	             return false;
	             j--;
	             }
	            else if(c==')')
	             {
	             if(j==-1)
	             return false;
	             else if(arr[j]!='(')
	             return false;
	             j--;
	             }

	            else if(c=='}')
	             {
	             if(j==-1)
	             return false;
	             else if(arr[j]!='{')
	             return false;
	             j--;
	             }
	          

	            
		 }
	            return true;
	           
	}
}


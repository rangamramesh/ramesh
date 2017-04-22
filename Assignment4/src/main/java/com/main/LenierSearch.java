package com.main;

public class LenierSearch {
     
	/*public static void main(String[] args) {
		int array[]={1,2,3,4,5,8,9,15,16,19};
		
System.out.println(searchLenier(array,15));
	}*/
   public int searchLenier(int array[],int a){
	   int length=array.length;
	   int result=-1;
	   if(array[length-1]>a){
	   for(int i=0;i<length;i++){
		   if(array[i]==a){
			   result= i;
		   }
	   }
   }
	   System.out.println(result);
	return result;
}
}

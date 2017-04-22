package com.main;

public class SelectionSort {

	/*public static void main(String[] args) {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		System.out.println(selectionSorting(array));


	}*/

	public String selectionSorting(int[] array) {

		String Result="";
		int j;
		boolean negtive=false;
		for(int i=0;i<array.length;i++){
			if(array[i]<0){
				negtive=true;
			}
		}
		if(array.length==0){
			Result="Array Elements are not Entered";
		}
		else if(negtive){
			Result="you have Entered -ve values";
		}
		else{
			for(int i=0;i<array.length-1;i++){
				int minindex = i;
				for ( j = i + 1; j < array.length; j++)
					if (array[j] < array[minindex]){
						minindex = j;
					}
				int smallerNumber = array[minindex]; 
				array[minindex] = array[i];
				array[i] = smallerNumber;

			}
			for(int k:array){
				Result+=k+" ";
			}
		}
		System.out.println(Result);
		return Result;
	}

}

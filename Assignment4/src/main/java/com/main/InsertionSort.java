package com.main;

public class InsertionSort {

	/*public static void main(String[] args) {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		int array[]={};
		System.out.println(insertionSorting(array));

	}*/

	public static String insertionSorting(int[] array) {
		String Result="";
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
          //insertion sort
			for(int i=1;i<array.length;i++){

				int valueinsert=array[i];
				int holder=i;
				while(holder>0&&(valueinsert<array[holder-1])){
					array[holder]=array[holder-1];
					holder--;
				}
				array[holder]=valueinsert;
			}

			for(int k:array){
				Result+=k+" ";
			}
		}
		System.out.println(Result);
		return Result;
	}

}

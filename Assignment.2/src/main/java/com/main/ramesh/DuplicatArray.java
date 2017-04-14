package com.main.ramesh;

public class DuplicatArray {

	public String duplicate(int[] arr) {

	    int a = arr.length;

	    for (int i = 0; i < a; i++) {
	        for (int j = i + 1; j < a; j++) {
	            if (arr[i] == arr[j]) {                  
	                int shiftLeft = j;
	                for (int k = j+1; k < a; k++, shiftLeft++) {
	                    arr[shiftLeft] = arr[k];
	                }
	                a--;
	                j--;
	            }
	        }
	    }
	    String result="";
	    for(int i = 0; i < a; i++){
	     result+=arr[i]+" ";
	    }
	    return result;
	}

}

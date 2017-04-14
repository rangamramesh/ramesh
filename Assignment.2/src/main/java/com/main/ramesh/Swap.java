package com.main.ramesh;

public class Swap {

	public String  swap(int a,int b){
		if(a==0&&b==0){
			return "You entered numbers are zero";
		}
		else if(a==b){
			return "you Entered equal numbers";
		}
		else{
			a=a+b;
			b=a-b;
			a=a-b;
			return a+" "+b;
		}
	}

}

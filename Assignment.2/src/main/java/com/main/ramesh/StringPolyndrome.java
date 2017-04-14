package com.main.ramesh;

public class StringPolyndrome {

	public static void main(String[] args) {
		String str="ramamar";
		System.out.println(isPolyndrome(str));

	}

	public static boolean isPolyndrome(String str) {
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-(i+1))){
				flag=false;
				break;
			}
		}
		return flag;

	}

}

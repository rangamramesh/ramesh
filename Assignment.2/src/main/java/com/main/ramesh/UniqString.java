package com.main.ramesh;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqString {

	public static void main(String[] args) {
	String result=doUniq("rangamramesh");
	System.out.println(result);

	}

	public static String doUniq(String word) {
		if(word==null){
			return "String was not Entered";
		}
		else{
	   char[] chars=word.toCharArray();
	   Set <Character> charset=new LinkedHashSet<Character>();
	   for(char c:chars){
		   charset.add(c);
	   }
	   StringBuilder str=new StringBuilder();
	   for(Character c:charset){
		   str.append(c);
	   }
	return str.toString();
	
	 }
	}
}

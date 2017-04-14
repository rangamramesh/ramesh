package com.main.ramesh;

public class PrimeFactor {

	public String primeFactors(int n)
	{
		String Result="";
		if(n==0){
			Result="You have Entered Zero";
		}
		else if(n==1){
			Result="you have Entered 1 there is no Prime Factors";
		}
		else{
		for(int i=2;i<=n-1;i++)
		{
			if(isPrime(i)){
				if(n%i==0){
					Result+=i+" ";
				}
			}
		}
		
		}
		System.out.println(Result);
		return Result;
	}
	public static boolean isPrime(int n){
		boolean flag=true;
		for(int j=2;j<=n/2;j++)
		{
			if(n%j==0){
				flag=false;
				break;
			}
		}
		return flag;
		
	}

}

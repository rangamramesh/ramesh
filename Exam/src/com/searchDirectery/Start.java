package com.searchDirectery;
public class Start {
	public static void main(String[] args)
	{
	FileWithTread	 s=new FileWithTread();
	ThreadA ta=new ThreadA(s,"Java","C:\\Users\\ranga\\Desktop\\Filename");
		ta.start();
		ThreadB tb=new ThreadB(s,"main","C:\\Users\\ranga\\Desktop\\Filename\\filename2");
		tb.start();
		ThreadC tc=new ThreadC(s,"language","C:\\Users\\ranga\\Desktop\\Filename\\filename3");
		tc.start();
		
}
}

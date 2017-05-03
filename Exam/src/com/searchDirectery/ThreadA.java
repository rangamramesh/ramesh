package com.searchDirectery;

import java.io.IOException;
import java.util.List;

public class ThreadA extends Thread {
	FileWithTread fw2;
	String text,directory;
	public ThreadA(FileWithTread fw1,String text,String directory){
		this.setName("thread A");
		System.out.println("ThreadA started");
	fw2=fw1;
	this.text=text;
	this.directory=directory;
	}
	
	public void run()
	{
		System.out.println("ThreadA running");
		try
		{
			List<String> s=fw2.textFinder(text,directory);
			System.out.println(s);
			System.out.println( "ThreadA ended");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	
	}
	

}

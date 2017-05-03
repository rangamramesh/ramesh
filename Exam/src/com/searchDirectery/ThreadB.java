package com.searchDirectery;

import java.io.IOException;
import java.util.List;

public class ThreadB extends Thread {
	FileWithTread sf2;
	String text,directory;
	public ThreadB(FileWithTread sf1,String text,String directory)
	{
	this.setName("Thread B");
		System.out.println("ThreadB started");
	sf2=sf1;
	this.text=text;
	this.directory=directory;
	}
	
	public void run()
	{
		System.out.println("ThreadB running");
		try
		{
			List<String> s=sf2.textFinder(text,directory);
			System.out.println(s);
			System.out.println( "ThreadB ended");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	
	}

}

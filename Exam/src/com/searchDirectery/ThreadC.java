package com.searchDirectery;

import java.io.IOException;
import java.util.List;

public class ThreadC extends Thread {
	FileWithTread sf2;
	String text,directory;
	public ThreadC(FileWithTread sf1,String text,String directory){
		this.setName("Thread C");
		System.out.println("ThreadC started");
	sf2=sf1;
	this.text=text;
	this.directory=directory;
	}
	
	public void run()
	{
		System.out.println("ThreadC running");
		try
		{
			List<String> s=sf2.textFinder(text,directory);
			System.out.println(s);
			System.out.println( "ThreadC ended");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	
	}
	

}

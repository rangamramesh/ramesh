package com.main.ramesh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class Find_Text {
	static String output="";
	static String line;
	static String s="";
	public static List<String> textFinder(String text,String path)throws IOException {
		List<String> result=new ArrayList<String>();
		File folder=new File(path);
		if(folder.isDirectory())
		{
			File[] listofFiles=folder.listFiles();

			for(File file:listofFiles)
			{
				if(file.isFile())
				{
					s=file.getCanonicalPath().toString();
					LineNumberReader lineReader=new LineNumberReader(new FileReader(s));
					while((line=lineReader.readLine())!=null)
					{
						if(line.contains(text))
						{
							result.add("The text exists at"+","+lineReader.getLineNumber()+" in file "+file.getName());
						}
					}
				}	
				else if(file.isDirectory()){

					result.addAll(textFinder(text,file.getAbsolutePath()));
				}
			} 
		}else if(!folder.isDirectory()){
			//return "please Enter exact path";
		}

		return result;
		/*if(output.equals(""))
				return "text not found in any file";
		}
			return output;	*/
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String text=br.readLine();
		String path=br.readLine();
		// output=textFinder(text,path);
		System.out.println(textFinder(text,path));
	}

}

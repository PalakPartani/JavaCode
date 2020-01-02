package com.bridgelabz.fellowshipprograms.utility;
import java.io.*;
import java.util.*;

public class UtilityNew {


	public static String reader(String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
	
		return s;
	}
	
	public static void writer(String path,String s) throws IOException
	{
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(path));
		bw.write(s);
		
	}
}

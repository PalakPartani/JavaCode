package com.bridgelabz.fellowshipprograms.utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;

public class Utility 
{	BufferedReader br;


//constructor to initialize bufferedReader
public Utility(){
	br = new BufferedReader(new InputStreamReader(System.in));
}


//take input word
public String inputString(){
	try{
		return br.readLine();
	}
	catch(IOException ioe){
		System.out.println(ioe.getMessage());
	}
	return "";
}




//Take file name as input and return string of file text
	public String getFileText(String fileName){
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}
	
	//this function take two parameter 
	// 1 what data to write.
	// 2 file name
	public void writeToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write(data); 
		writer.flush();
		writer.close();
	}
}

package com.bridgelabz.fellowshipprograms.functional;
import java.util.Date;
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
import UserDetails;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import com.bridgelabz.fellowshipprograms.functional.UserDetails;
//import .utility;
import com.bridgelabz.fellowshipprograms.utility.Utility1;;
public class Regex {

	public static void main(String args[])
	{
		public class Regex
		{
			public static void main(String args[])
			{
				Utility1 u=new Utility1();

				UserDetails user=new UserDetails();
				System.out.println();
			
				//asking user to enter his data
				System.out.println("Enter FirstName:");
				user.setfName(u.inputString());
				System.out.println();
			
				System.out.println("Enter LastName:");
				user.setlName(u.inputString());
				System.out.println();
			
				System.out.println("Enter Mobile Number:");
				user.setmobileNo(u.inputString());
				System.out.println();	
				
				//Setting current date
				user.setdate(u.getFormatedDate(new Date()));
				System.out.println(u.convertString(user,u.getFileText("newfile.txt")));	
			}
		}
	
}
}
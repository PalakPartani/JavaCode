package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.Scanner;
import  com.bridgelabz.fellowshipprograms.utility.AlgorithmUtility;
public class RegexNew {
public static void main(String[]args)
{
	Scanner scanner=new Scanner(System.in);
	AlgorithmUtility utility=new AlgorithmUtility();
	String output;
	//name only
	System.out.println("Enter username");
	String fname=scanner.nextLine();
	if(fname.length()>3)
	{
		System.out.println("");
	}
	else
		System.out.println("Enter name whose length is greater than 3");
	output=utility.Regeximplement(fname);
	
	//fullname
	//System.out.println("Enter your midname: ");
	//String midname=scanner.nextLine();
	//System.out.println("Enter your lastname: ");
	//String lname=scanner.nextLine();
	//String outputname=utility.Regeximplement(fname,midname,lname);
	
	//altername
	System.out.println("Enter your fullname: ");
	String fulname=scanner.nextLine();
	String outputname1=utility.Regeximplement4(fulname);
	
	
	//Mobile No
	System.out.println("Enter your mobile no: ");
	String mob=scanner.nextLine();
	System.out.println("Enter your mobile no: ");
	String outputmob=utility.Regeximplement2(mob);

	//Date
	System.out.println("Enter date: ");
	String date=scanner.nextLine();
	String outputdate=utility.Regeximplement3(date);

	System.out.println("Hello "+output+"We have your full name as "+outputname1+" in our system. your contact number is "+outputmob+" Please,let us know in case of any clarification Thank you BridgeLabz "+outputdate);
	scanner.close();
}
}

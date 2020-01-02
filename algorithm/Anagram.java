//Anagram Program
package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	public static void main(String[]args)
	{
		//Scanner class object defined
	Scanner scobj=new Scanner(System.in);
	
	System.out.println("Enter the first string");
	//Taking string as input from nextLine()
	String s1=scobj.nextLine();
	
	System.out.println("Enter the second string");
	String s2=scobj.nextLine();
	
	//Two array of char type created 
	char []ch1=s1.toLowerCase().toCharArray();
	char []ch2=s2.toLowerCase().toCharArray();
	
	//static method sort called by class name Array.
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	if(Arrays.equals(ch1,ch2))
	{
		System.out.println("Anagram");
	}
	
	else
	    {
			System.out.println("It is not anagram");

	    }
	scobj.close();
	}
}

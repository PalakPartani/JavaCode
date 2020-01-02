//Permutation of string code done through util package and collection.
package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.Scanner;



public class PermutationString {
	public static void main(String args[])
	{
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter String for finding its permutation: ");
		String str=scobj.nextLine();
		String str1=str;
		permutationstr(str1,"");
	
		scobj.close();
	}
		static void permutationstr(String str,String gen_str)
		{
			
			if(str.length()==0)
			{
				System.out.println(gen_str+"");
			}
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				String str3=str.substring(0, i)+str.substring(i+1);
				permutationstr(str3,gen_str+ch);
			}
		}
	}





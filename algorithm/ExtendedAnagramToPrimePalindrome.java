//Extended Anagram.
package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.Scanner;
public class ExtendedAnagramToPrimePalindrome {

	public static void main(String[]args)
	{
	    Scanner scobj=new Scanner(System.in);
		int n=scobj.nextInt();
		int[]arr=new int[n];
		int count=0;
		int l=0;
		for(int i=0;i<=n;i++)
		{
			count++;
			for(int k=i;k>=1;k--)
			{
				if(i%k==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				arr[l]=i;
				l++;
			}
		}
		System.out.println("Prime");
		
	

		for(int x=0;x<l;x++)
		{
			int temp=arr,palin=0,r;
			while(a>0)
			{
				r=a%10;
				palin=
		}
	}
}

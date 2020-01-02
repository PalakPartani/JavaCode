package com.bridgelabz.fellowshipprograms.functional;

public class SecondLargest {

	public static void main(String args[])
	{
		int[] arr= {1,4,3,2,6};
		int l1=0,l2=0,temp;
		for(int i=0;i<5;i++)
		{
			if(l1<arr[i])
			{
			temp=l1;
			l1=arr[i];
			l2=temp;
		   }
			else if(l2<arr[i])
			{
				l2=arr[i];
			}}
		System.out.println(l2);
		}
	}
		


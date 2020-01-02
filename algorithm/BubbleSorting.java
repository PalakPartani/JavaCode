//bubble sort 
package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.Scanner;
public class BubbleSorting {

	public static void main(String[]args)
	{
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=scobj.nextInt();
		System.out.println("Enter array ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scobj.nextInt();
		}
		int len=arr.length;
		bubblesort(arr,len);
		for(int i=0;i<n;i++)
		{
		
			System.out.println(arr[i]+"");
			}
		
	
		scobj.close();
	}
		
		static void bubblesort(int arr[],int len)
		{
			for(int i=0;i<len-1;i++)
			{
				for(int j=0;j<len-i-1;j++)
				{
					if(arr[j+1]<arr[j])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
				
		}
	}


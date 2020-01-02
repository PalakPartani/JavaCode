//array triplet
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;

class arraysump
{
public static void main(String[] args)
{
	int sum=0;
	Scanner scobj=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=scobj.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the array: ");
	for(int i=0;i<n;i++)
	{
		a[i]=scobj.nextInt();
	}

	for(int i=0;i<n-2;i++)
	{
		for(int j=1;j<n-1;j++)
		{
			for(int k=2;k<n;k++)
			{
				if(a[i]+a[j]+a[k]==0)
				{ 
					System.out.println("a["+i+"]+"+"a["+j+"]+"+"a["+k+"]=0");
				}
				scobj.close();
			}
		}
	}
	} 
}







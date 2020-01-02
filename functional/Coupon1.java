package com.bridgelabz.fellowshipprograms.functional;
import java.util.Random;
import java.util.Scanner;
public class Coupon1 {
public static void main(String[] args)
{
	Scanner scobj=new Scanner(System.in);
	System.out.println("Enter the range");
	int range=scobj.nextInt();

	int n;
	System.out.println("Enter the number");
	n=scobj.nextInt();
	
	if(n>range)
	{
		System.out.println("Please enter value within range");
	}
	else
	{
		int count=0,chk=1,ch[]=new int[range];
		int c=0,k;
		int fcpn=0;
		while(c<range)
		{
			int collected=collect(range,n);
					for(k=0;k<range;k++)
					{
						if(ch[k]==collected)
						{
							chk=0;
						}
 						
					}
		
			if(chk!=0)
			{
				System.out.println("Collected"+collected+"");
				count++;
				fcpn++;
				c++;
				
			}
			if(collected==n)
			{
				System.out.println("Collected"+collected+"");
				fcpn++;
				System.out.println("value at"+fcpn);
				break;
			}
		}
	}
		scobj.close();
}

	

static int collect(int range,int n)
{
	Random robj=new Random();
	int rno=robj.nextInt(range);
	return rno;
}
}


package com.bridgelabz.fellowshipprograms.utility;

//Utility for Coupon Number Code.
public class LogicalUtility {
	//method to calculate the random coupon
	
public int GenCoupon(int range)
{
	boolean []arr=new boolean[range];
	int no=0,count=0;
	while(no<range)
	{
		int value=RandomNumber(range);
		System.out.println(value+"");
		if(!arr[value])
		{
			no++;
		
		arr[value]=true;
		System.out.println(arr[value]+"");
		}
		count++;
		//for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index "+i+" value "+arr[i]+"\n");
		}
	}
	return count;
}
public int RandomNumber(int range)
{
	return (int)(Math.random()*range);
}
}

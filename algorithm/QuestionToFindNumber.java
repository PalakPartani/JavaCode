package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.Scanner;
public class QuestionToFindNumber {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number for range ");
		int no=scanner.nextInt();
		int n=(int)Math.pow(2,no);
		System.out.println("Think value between the range from 0 to "+(n-1)+"");
		System.out.println("");
		//int find=scanner.nextInt();
		int result=search_No(0,n);
		System.out.println("Value is "+result);
		  
	}
		
		static int search_No(int low,int high)
		{
			Scanner scanner=new Scanner(System.in);
			
            if((high-low)==1)
            	return low;
            int mid=(low+(high-low))/2;
         
            System.out.println("Is It less than "+mid+ "then please enter 1 else 0");
            int check=scanner.nextInt();
           
            if(check==1)
            	return search_No(low,mid);
            else
            	return search_No(mid,high);
			
		}
	}


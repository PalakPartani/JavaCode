package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.LogicalUtility;;
public class couponnew {
	
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the range ");
			int range=scanner.nextInt();
			LogicalUtility utility = new LogicalUtility();
			int count=utility.GenCoupon(range);
			System.out.println("Count "+count);
			scanner.close();
			
		}
	}


//Prime factor
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;
public class PrimeFactor {
public static void main(String[]args)
{
	Scanner scobj=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int no=scobj.nextInt();
    for(int i=2;i<no;i++)
    {
    	while(no%i==0)
    	{
    		System.out.println(i+"");
    		no=no/i;
    	}
    	
    }
    if(no>2)
		System.out.println(no);
scobj.close();
}
}

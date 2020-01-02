//Vending program
package jUnitTesting;
import java.util.Scanner;
public class VendingMachine {
public static void main(String[]args)
{
	int[] arr={1,2,5,10,50,100,500,1000};
	int change;
	Scanner scobj=new Scanner(System.in);
	System.out.println("Enter change ");
	change=scobj.nextInt();
	for(int i=arr.length-1;i>0;i--) //loop will go upto len-1,if taken upto len it will throw exception
	{
		int count=0;
		while(change>=arr[i])
		{
			change=change-arr[i];
			count++;
		
		}
		
			System.out.println("The "+arr[i]+"-note :"+count+"*"+arr[i]+"="+count*arr[i]);
		
	}
	scobj.close();
}
}
//1,2,5,10,50,100,500,1000
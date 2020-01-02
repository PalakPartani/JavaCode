package com.bridgelabz.fellowshipprograms.algorithm;
import com.bridgelabz.fellowshipprograms.utility.AlgorithmUtility;
import java.util.Scanner;

public class GenericsExample {
 public static void main(String[]args)
 {
	 Scanner scanner=new Scanner(System.in);
	 Integer intarr[]= {2,3,1,5};
	 Character chararr[]= {'b','a','g','k'};
	 AlgorithmUtility utility=new AlgorithmUtility();
	 utility.insertionSort(intarr,intarr.length);
	 System.out.println("The sorted array is ");
	 System.out.println("Integer array");

	 for(int i=0;i<intarr.length;i++)
	 {
		 System.out.println(intarr[i]);
	 }
	// utility.search(intarr);
	 utility.insertionSort(chararr,chararr.length);
	 System.out.println("Integer array");

	 
	 for(int i=0;i<chararr.length;i++)
	 {
		 System.out.println(chararr[i]);
	 }
	 utility.binarySearch(intarr,intarr.length)(intarr);
 }
	
}

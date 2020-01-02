package jUnitTesting;
import java.util.Scanner;
import com.bridgelabz.fellowshipprograms.utility.AlgorithmUtility;
public class Binary {
 public static void main(String args[])
 {
	 AlgorithmUtility utility=new AlgorithmUtility();
	 int r,dectobinary;
	 int resofswap;
	 String x="";
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter integer ");
	 int integer=scanner.nextInt();
	 if(integer>255)
		 System.out.println("Enter no within 255");
	 else
	 {
		 while (integer>0)
		 {
			 r=integer%2;
			 x=r+""+x;
			 integer=integer/2;
		 }
		 System.out.println("Binary is:"+x);
		 resofswap=utility.swapnibbles(integer);
		 System.out.println("Result of swapnibble "+resofswap);
	 }
	
	scanner.close();
 }
}

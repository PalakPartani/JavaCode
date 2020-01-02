package jUnitTesting;
import java.util.Scanner;
public class toBinary {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int []binary=new int[1000];
		System.out.println("Enter number: ");
		int no=scanner.nextInt();
		if(no>0)
		{
		int i=0;
		while(no>0)
		{
		     { 
		            // storing remainder in binary array 
		            binary[i] = no % 2; 
		            no = no / 2; 
		            i++; 
		        }
		}
		   
		     if(i>8)
		     {
		    	 while(binary[i]!=7)
		    		 binary[i]=0;
		    	 i++;
		     }
		        // printing binary array in reverse order 
		    for (int j = 7; j >= 0; j--) 
		           System.out.print(binary[j]);
		}
		
		
	}
	}



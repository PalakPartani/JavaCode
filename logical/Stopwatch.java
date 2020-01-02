package com.bridgelabz.fellowshipprograms.logical;
import java.util.Scanner;
public class Stopwatch {

	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		int starttime=0,stoptime=0;
		double showstarttime=0;
		double showstoptime=0;
		System.out.println("Enter 1 to start the time: ");
		starttime=scanner.nextInt();
		if(starttime==1)
		{
		showstarttime=System.currentTimeMillis();
		}
		else
			System.out.println("No other numbers allowed ");
		
		System.out.println("Enter 0 to stop the time: ");
		stoptime=scanner.nextInt();
		if(stoptime==0)
		{
		showstoptime=System.currentTimeMillis();
		
		}
		else
			System.out.println("No other numbers allowed ");
		
		double showtime=((showstoptime-showstarttime)/1000);
		System.out.println("Time Elapsed is: "+showtime+" seconds");
		
		
	}
}

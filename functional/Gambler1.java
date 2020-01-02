package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;
public class Gambler1 {
public static void main(String args[])
{
	int stake,goal,trial;
Scanner scanner=new Scanner(System.in);
	System.out.println("Enter stake ");
	stake=scanner.nextInt();
	System.out.println("Enter goal ");
	goal=scanner.nextInt();

	System.out.println("Enter trial ");

	trial=scanner.nextInt();
	int t=0;
	int win=0;
	int loss=0;
	
	if(stake!=0 && goal >= stake && trial!=0)
	{
		while(trial==0)
		{
			t++;
			
			if(Math.random()>0.5)
			{
			
				win++;
				
			}
			else
				loss++;
			
		
		if(stake==goal)
		
			break;
			
		
		else
			break;
			
		}
		//double w1=(win*100)/t;
		System.out.println("Won");
		System.out.println("Loss");
		System.out.println("You won with % "+float(win*100)/t);
		System.out.println("You loss % "+(loss*100)/t);
	}

scanner.close();
}
}

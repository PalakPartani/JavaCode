package com.bridgelabz.fellowshipprograms.DataStructure;
import java.util.Scanner;
public class BankingCounterQueue {
	
	public static void main(String[]args)
	{		
		Scanner scanner = new Scanner(System.in);

		int choice;
		int amount=0;
		int bankBalance=0;
		System.out.println("Press 1: for withdraw \n press 2: for deposit");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter amount to withdraw:");
			amount = scanner.nextInt();
			bankBalance = bankBalance - amount;
			System.out.println("Thank you for withdrawing");
			amount=0;
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			amount = scanner.nextInt();
			bankBalance = bankBalance + amount;
			System.out.println("Thank you for depositing.");
			amount=0;
			break;
		default:
			System.out.println("Please enter valid option");
		}
	}
}
	
	/*
	
   static int deposit();
	static void withdraw();
	
	static class Queue
	{
		int front=0;
		int rear=0;
		void Enqueue()
		{
			if(checkop=="Deposit")
			{
				deposit();
			}
		}
		void Deque()
		{
			
		}
	

public static void main(String[]args)
{
    Scanner scanner=new Scanner(System.in);
    String checkop;
    System.out.println("Enter the operation to perform ");
    checkop=scanner.next();
    Enqueue();
}
}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

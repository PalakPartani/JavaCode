package com.bridgelabz.fellowshipprograms.DataStructure;
import java.io.*;
import java.util.*;
public class Bank {

	
	//import  Simple.Queue;

	int front;
	int rear;
	int size;
	int[]queue=new int[10];
	int balance=50000;

	public void enQueue(int acc)
	{
	queue[rear]=acc;
	rear++;
	size++;

	}
	public int deQueue()
	{
	int data=queue[front];
	front++;
	size--;
	return data;
	}
	public void show()
	{
	System.out.println("Customers ");
	for(int i=1;i<size+1;i++)
	System.out.println(queue[i]+"");
	}

	//method to withdraw

	  public void withDraw()
	{
	    System.out.println("Enter the amount to withdraw");
	    Scanner sc=new Scanner(System.in);
	int amnt=sc.nextInt();
	   balance=balance-amnt;
	   System.out.println("Remainig balance: "+balance);
	}

	public void deposit()
	{
	   System.out.println("Enter the amount to deposit");
	   Scanner sc=new Scanner(System.in);
	int amnt=sc.nextInt();
	balance=balance+amnt;
	   System.out.println("Remainig balance: "+balance);

	}



	public static void main(String[]args)throws IOException
	{
	Scanner sc=new Scanner(System.in);

	Bank bank =new Bank();

	System.out.println("Enter acc no");
	int[] arr=new int[10];

	for(int i=0;i<arr.length;i++)

	arr[i]=sc.nextInt();
	 
	//Moving array value to queue

	for(int i=0;i<arr.length;i++)
	{
	bank.enQueue(arr[i]);
	}

	//Switch op to select op
	System.out.println("Press 1 to withdraw ");
	 System.out.println("Press 2 to deposit ");
	  System.out.println("Press anything for Exit");
	System.out.println("Enter choice ");
	int c=sc.nextInt();
	switch(c)
	{
	case 1:
	bank.withDraw();
	bank.deQueue();
	bank.show();
	break;
	     case 2:
	 bank.deposit();
	 bank.deQueue();
	 bank.show();
	 break;

	      default:
	  break;
	 }
	}
}



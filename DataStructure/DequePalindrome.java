package com.bridgelabz.fellowshipprograms.DataStructure;
import java.util.Deque;
import java.util.Scanner;
public class DequePalindrome {

//	static class Deque
//	{
		Object deque1[]=new Object[10];
		Object deque2[]=new Object[10];
		int front;
		int rear;
		int size;
		
		public void insertFromFront(char ch)
		{
			if(size==10)
			{
				System.out.println("Queue is Full now!");
			}
			else
			{
				deque1[front]=ch;
				size++;
				show1();
			}
		}
		public void insertFromRear(char ch)
		{
			if(size==10)
			{
				System.out.println("Queue is Full now!");
			}
			else
			{
				//size=0;
				deque2[rear]=ch;
				rear++;
				size++;
				
				show2();
			}
		}
		
		public int deleteFromFront()
		{
			 int data=(Integer) null;
			if(size==0)
			{
				System.out.println("Queue is empty now!");
			}
			else
			{
				data=(int) deque1[front];
				for (int i = front; i < rear; i++) {
					deque1[i]=deque1[i+1];
				}
				deque1[rear]=null;
				size--;
				
			}
			return data;
		}
		public int deleteFromRear()
		{
			int data=(Integer) null;
			if(size<=0)
			{
				System.out.println("Queue is empty now!");
			}
			else
			{
				data= (int) deque2[rear];
				deque2[rear]=null;
				rear--;
				size--;
			}
			return data;
		}
		public int size() {
			return size;
		}
		public void show1()
		{
			for (int i = front; i <= rear; i++)
			{
				System.out.print(deque1[i]+" ");
			}
		}
		public void show2()
		{
			for (int i = rear; i <=front; i++)
			{
				System.out.print(deque2[i]+" ");
			}
		}
		
	//}
		
	public static void main(String[]args)
	{
		DequePalindrome dp=new DequePalindrome();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string: ");
		String input=scanner.nextLine();
		char []ch=new char[input.length()];
		int len=input.length();
		
		for(int i=0;i<len;i++)
		{
			 ch[i]=input.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++)
		{
		dp.insertFromFront(ch[i]);
		}
		
		for(int i=0;i<ch.length;i++)
		{
		dp.insertFromRear(ch[i]);
		}
		
		for(int i=0;i<ch.length-1;i++)
		{
			//for(int j=0;j<ch.length;j++)
		//	{
		
				if(( dp.deque1[i]).equals(dp.deque2[i]))
				{
					System.out.println("Palindrome ");
						}
				else
					System.out.println("Not Palindrome ");
			
			}
		}
	}

//}

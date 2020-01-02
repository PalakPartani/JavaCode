package com.bridgelabz.fellowshipprograms.DataStructure;

public class Stack {

	int[] Stack=new int[200];
	int top=0;
	public void push(int data)
	{
		Stack[top]=data;
		top++;
	}
	public int pop()
	{
		int data=Stack[top];
		top--;
		return data;
		
	}
}

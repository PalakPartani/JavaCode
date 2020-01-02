package com.bridgelabz.fellowshipprograms.functional;

public class Arraydemo {
public static void main(String[]args)
{
	int[][]a= {{1,2,3},{2,1,3},{1,3,2}};
	int rdiagonal=0;
	int n=3;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j) {
				
			}
			if((i+j)==n-1)
			{
				rdiagonal=rdiagonal+a[i][j];
				
			}
		}
	}
	System.out.println("Right diagonal: "+rdiagonal);
}
}

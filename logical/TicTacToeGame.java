//Tictactoe

package Logical;
import java.util.Scanner;
public class TicTacToeGame {

	public static void player1Move(int arr[][],char arr1[][],int pos)
	{
		//For placing the X in respective index calculating value of a and b as row and col.
		int a=(pos-1)/3;   
		int b=(pos-1)%3;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==a && j==b)
				{
					arr[i][j]=1;		//int array placing value 1 for indicating X
					arr1[i][j]='X';
				}
			}
		}
	}
	
	public static void player2Move(int arr[][],char arr1[][],int pos)
	{
		//For placing the X in respective index calculating value of a and b as row and col.

		int a=(pos-1)/3;
		int b=(pos-1)%3;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==a && j==b)
				{
					arr[i][j]=2;		//int array placing value 2 for indicating O
					arr1[i][j]='O';
				}
			}
		}
	}
	
	
	public static boolean checkWhoWins(int arr[][],int player)
	{
		if(player==1)
		{
			//Checking for rows or cols or diagonal int array value to be 3 as (1+1+1=3)
			if(arr[0][0]+arr[0][1]+arr[0][2]==3 || arr[1][0]+arr[1][1]+arr[1][2]==3 || arr[2][0]+arr[2][1]+arr[2][2]==3
					|| arr[0][0]+arr[1][0]+arr[2][0]==3 || arr[0][1]+arr[1][1]+arr[2][1]==3 || arr[0][2]+arr[1][2]+arr[2][2]==3
					|| arr[0][0]+arr[1][1]+arr[2][2]==3 || arr[0][2]+arr[1][1]+arr[2][0]==3)
			{
				return true;
			}
		}
		
		if(player==2)
		{
			//Checking for rows or cols or diagonal int array value to be 6 as (2+2+2=6)

			if(arr[0][0]+arr[0][1]+arr[0][2]==6 || arr[1][0]+arr[1][1]+arr[1][2]==6 || arr[2][0]+arr[2][1]+arr[2][2]==6
					|| arr[0][0]+arr[1][0]+arr[2][0]==6 || arr[0][1]+arr[1][1]+arr[2][1]==6 || arr[0][2]+arr[1][2]+arr[2][2]==6
					|| arr[0][0]+arr[1][1]+arr[2][2]==6 || arr[0][2]+arr[1][1]+arr[2][0]==6)
			{
				return true;
			}
		}
		return false;
		
	}
	
	//displaying values of matrix initially
	public static void display(char arr1[][])
	{
		int n=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(++n+"=| "+arr1[i][j]+" |");
			}
			System.out.println();
		}
	}
	//displaying matrix by the X or O character.
	public static void display2(int arr1[][])
	{
		int n=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(++n+"=| "+arr1[i][j]+" |");
			}
			System.out.println();
		}
	}
	
	
	//Main method
	public static void main(String[] args) {
		

		int arr[][]=new int[3][3];
		char arr1[][]=new char[3][3];
		int len=arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				arr1[i][j]='_';     //char array
			    arr[i][j]='_';		//int array
			}
		}
		
		System.out.println("TicTocToeGame");
		display(arr1);
		System.out.println();
		
		for(int i=0;i<5;i++)		//Loop will go from 0 to 4 as each user gets 4 chances.
		{
			System.out.println("Enter the player 1 position");
			Scanner s=new Scanner(System.in);
			int pos=s.nextInt();  //taking the position for placing X or O.
			player1Move(arr, arr1, pos);
			display(arr1);
			if(checkWhoWins(arr, 1))
			{
				System.out.println("Player 1 is won");
				break;
			}
			if(i==4)
			{
				System.out.println("Nobody wins the game");
				break;
			}
			
			System.out.println("Enter the player 2 position");
			int pos1=s.nextInt();
			player2Move(arr, arr1, pos1);
			display(arr1);
			if(checkWhoWins(arr, 2))
			{
				System.out.println("Player 2 is won");
				break;
			}
		}
	}
}


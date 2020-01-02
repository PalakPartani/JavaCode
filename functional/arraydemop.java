//Using Printwriter to show output.
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;
import java.io.PrintWriter;

class arraydemop
{
 public static void main(String[]args)
{
 int row,col;
 int[][] arr=new int[5][5];
 
 //PrintWriter object created.
PrintWriter writer=new PrintWriter(System.out);
//Scanner class object created
 Scanner scobj=new Scanner(System.in);
 
 writer.write("Enter number of rows ");
 writer.flush(); //method to clean
 row=scobj.nextInt();

 writer.write("Enter number of columns ");
 writer.flush();
 col=scobj.nextInt();

writer.write("Enter the array values using rows and columns");
writer.flush();
for(int i=0;i<row;i++)
{
 for(int j=0;j<col;j++)
{
  arr[i][j]=scobj.nextInt();

}
}
writer.write("Matrix is");
writer.flush();
 for(int i=0;i<=row;i++)
 {
   for(int j=0;j<=col;j++)
    {
     writer.write(arr[i][j]+"");
     writer.close();

 //System.out.println("");
    }
}
   writer.close();
   scobj.close();
  }
}

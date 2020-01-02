//Flip coin
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;

class flipcoinp
{
 //main function
 public static void main(String[]args)
  {
    //Scanner class object created to take input.
    Scanner scanner=new Scanner(System.in);

    //variable declared. 
    int number;

    //variable value will be input through nextInt() of scanner class.
    number=scanner.nextInt();

    double head=0,tail=0;
    for(int i=0;i<number;i++)
    {
    if(Math.random()<0.5)
      {
       
	System.out.println("head");
        head++;
      }   
     else
      
       System.out.println("tail");
       tail++;
    }
       //two variables created to calculate the percentage. 
       double h1,t1;
       h1=(head/number*100.00);
       t1=(tail/number*100.00);
      
       	System.out.println("Percent of head "+h1);
        System.out.println("Percent of tail "+t1);
        scanner.close();
  }
}

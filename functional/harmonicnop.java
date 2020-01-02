//Harmonic number
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;
class harmonicnop
{
 public static void main(String[]args)
 {
  Scanner scobj=new Scanner(System.in);
  int number;
  number=scobj.nextInt();
  double total=0;
  for(int i=1;i<=number;i++)
   {
    total=total+(1.00/i);   //for type
   } 
   System.out.println("Harmonic number is "+total);
   scobj.close();
}
}

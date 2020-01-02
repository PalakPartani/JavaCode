//Replace and print messaqge
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;

class hellop
{
  public static void main(String[]args)
   {
     Scanner scobj=new Scanner(System.in);
     String uname;
     uname=scobj.nextLine();
     int len=uname.length();
     if(len>3)
      {
        System.out.println("Hello "+uname+"how are you");
      }
      else
        System.out.println("Please enter name with atleast three characters.");
    
      scobj.close();
   }
}



package com.bridgelabz.fellowshipprograms.functional;

//distance program
class distancep
{
 public static void main(String[]args)
{
 System.out.println("Enter ther value using command line ");
 int x=Integer.parseInt(args[0]);
 int y=Integer.parseInt(args[1]);

 //distance calculated using Math class function named sqrt and pow.
double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
System.out.println("Distance is "+dist);
}
}


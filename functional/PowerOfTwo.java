//Power code
package com.bridgelabz.fellowshipprograms.functional;
import java.util.Scanner;
public class PowerOfTwo {

public static void main(String[]args)
{
int power;
int root=1;
Scanner scobj=new Scanner(System.in);
System.out.println("Enter the power: ");
power=scobj.nextInt();
//Power should not exceed 31 because int does not support uptill that value.
if(power<31)
{
for(int i=1;i<=power;i++)
{
root=2*i;
}
}
System.out.println("Power is "+root);
scobj.close();
}
}



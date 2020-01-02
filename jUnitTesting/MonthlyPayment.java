package jUnitTesting;
import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter principal");
		double P=scanner.nextDouble();
		System.out.println("Enter year");
		double Y=scanner.nextDouble();
		System.out.println("Enter rate");
		double R=scanner.nextDouble();

		paysal(P,Y,R);
		
	}
	static void paysal(double P,double Y,double R)
	{
		double pay;
		double n=12*Y;
		double r=R/(12*100);
		pay=(P*r)/(1-Math.pow((1+r),-n));
		System.out.println("The payment is "+pay);
	}
}

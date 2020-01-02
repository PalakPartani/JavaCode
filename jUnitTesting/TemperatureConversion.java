//Temperature conversion
package jUnitTesting;
import java.util.Scanner;

public class TemperatureConversion {
public static void main(String args[])
{
	System.out.println("Enter the temperature: ");
	//double type variable created  to take input
	Scanner scanner=new Scanner(System.in);

	double farenheit=scanner.nextDouble();
	
	convert(farenheit);
}
	static void convert(double farenheit)
	{
	 double celcius=(farenheit-32)*5/9;
	 System.out.println("Temperature in celcius:"+celcius);
	 
	farenheit=(celcius * 9/5) + 32;
	 System.out.println("Temperature in farenheit:"+farenheit);

	}
}


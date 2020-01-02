package jUnitTesting;
import com.bridgelabz.fellowshipprograms.utility.AlgorithmUtility;
import java.util.Scanner;
public class DaysofWeek {
public static void main(String args[])
{
	AlgorithmUtility utility=new AlgorithmUtility();

	int day,month,year,d1;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter day:");
	day=scanner.nextInt();
	
	System.out.println("Enter month:");
	month=scanner.nextInt();
	
	System.out.println("Enter year:");
	year=scanner.nextInt();
	
	d1=utility.calcday(day,month,year);
	switch(d1)
	{
	case 0:
		System.out.println("sunday:");
		break;
	
	case 1:
	System.out.println("Monday");
	break;

	case 2:
	System.out.println("Tuesday:");
	break;
	
	case 3:
		System.out.println("Wed:");
		break;
	
	case 4:
	System.out.println("Thus:");
	break;

	case 5:
	System.out.println("Friday:");
	break;
	case 6:
	System.out.println("Sat:");
	break;
	}
	scanner.close();
}
}

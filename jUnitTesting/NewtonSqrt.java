package jUnitTesting;
import com.bridgelabz.fellowshipprograms.utility.AlgorithmUtility;
import java.util.Scanner;

public class NewtonSqrt {
public static void main(String[]args)
{
	int c;
	double res;
	AlgorithmUtility utility=new AlgorithmUtility();
	
	Scanner scanner=new Scanner(System.in);
	c=scanner.nextInt();

	if(c>0)
	{
	res=utility.newtonsq(c);
	System.out.println(res);
	//System.out.println("Sqrt "+);
	}
	else
		System.out.println("Cant find of neg no");
}
}


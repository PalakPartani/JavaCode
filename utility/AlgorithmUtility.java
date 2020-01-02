package com.bridgelabz.fellowshipprograms.utility;
import java.util.Scanner;
public class AlgorithmUtility {
	
	//Question Number
	public static void QuesNo(int range)
	{
		Scanner scanner=new Scanner(System.in);
		int li=0;
		int hi=range-1;
		int mi=(li+hi/2);
		System.out.println();
		System.out.println("Think a no between 0 to"+(range-1));
		while(li<hi)
		{
			System.out.println("If your no is between "+li+"to"+mi+"Press1");
			System.out.println("If your no is between "+(mi+1)+"to"+hi+"Press0");
			int uvalue=scanner.nextInt();
			if(uvalue==1)
			{
				hi=mi;
				mi=(li+hi)/2;
			
			}
			else if(uvalue==0)
			{
			li=mi+1;
			mi=(li+hi)/2;

			}
			else
				System.out.println("Wrong Input provided ");
			
			
		}
	
    System.out.println("Your No :"+mi);
    scanner.close();
	}
	
	
	public static int calcday(int day,int month,int year)
	{
		int y1,x,m,d1;
		y1=year - (14 - month) / 12;
		x=y1 + y1/4 - y1/100 + y1/400;

	    m= month + 12* ((14 -month) / 12)-2;
	    d1= (day + x + 31*m / 12) % 7;

	    return d1;
				

	}
	
	//Newton sqrt
	public static double newtonsq(int c)
	{
		double t,epsilon;
		t=c;
		epsilon=1e-15;
		while((Math.abs(t-c)/t) > epsilon+t)
		{
			t=(c/t+t)/2.0;
			
		}
		return t;
		
		
	}
	//binaryy cov
	public static int swapnibbles(int dectoBinary)
	{
		return (((dectoBinary & 0x0F)<< 4)|((dectoBinary & 0xF0)>>4));
	}
	
	
	//Regex function
	
	public static String Regeximplement(String fname)
	{
		String username="<<username>>";
		return username.replaceAll("<<username>>",fname);
	}
	/*	public static String Regeximplement(String fname,String mname,String lname)
		{
		
		String username="<<username>>";
		String midname="<<midname>>";
		String lastname="<<lastname>>";
		String fulname="<<fullname>>+<<midname>>+<<lastname>>";
		return fulname.replaceAll("<<username midname lastname>>",fname + midname +lname);
	}*/
		public static String Regeximplement4(String fulname)
		{
			String fullnname="<<fullname>>";
			return fullnname.replaceAll("<<username>>",fulname);
			
		}
		
		
		public static String Regeximplement2(String mob)
		{
			String contact="<</^[0-9]*$/>>";
			return contact.replaceAll("<</^[0-9]*$/>>",mob);
		}
		
		public static String Regeximplement3(String cdate)
		{
			String date="<<01/12/2016>>";
			return date.replaceAll("<<01/12/2016>>",cdate);
		}
	
	
	
	///^[0-9]*$/;
	//91XXXXXXXXXX
	
	
	
	
	
	
	
	

	//Sorting
	//public <T>sort()
	  public static <T extends Comparable<T>> void insertionSort (T[] list, int size) 
	  {
	    int outCounter, inCounter;
	    T temp;
	    // Sort list[] into increasing order.
	    for (outCounter = 1; outCounter < size; outCounter++)
	    {
	      temp = list[outCounter];
	      for (inCounter =outCounter; inCounter > 0 && list[inCounter - 1].compareTo(temp) > 0; inCounter--)
	      {
	    	  list[inCounter] = list[inCounter - 1];
	      }
	      list[inCounter] = temp;
	    }
	  }
	  
	  //Searching
	  public static <T extends Comparable<T>> int binarySearch(T[] array, T value, int lo, int hi) {
			if (lo < hi) {
			    int mid = (lo / 2) + (hi / 2);
			    int cmp = array[mid].compareTo(value);
			    if (cmp < 0) return binarySearch(array, value, lo, mid - 1);
			    if (cmp > 0) return binarySearch(array, value, mid + 1, hi);
			    return mid;
			} 
			return -1;
		    } 
            //linear search
		    public static <T extends Comparable<T>> int linearSearch(T[] array, T value, int lo, int hi) {
			for (int i = lo; i <= hi; i++) {
			    if (array[i].compareTo(value) == 0) return i;
			} 
			return -1;
		    } 

		    public static <T> void swap(T[] array, int lhs, int rhs) {
			T tmp = array[lhs];
			array[lhs] = array[rhs];
			array[rhs] = tmp;
		    } // swap

		    public static <T extends Comparable<T>> int partition(T[] array, int piv, int lo, int hi) {
			T val = array[piv];
			while (lo < hi) {
			    while (array[lo].compareTo(val) < 0) lo++;
			    while (array[hi].compareTo(val) > 0) hi--;
			    swap(array, lo, hi);
			} // while
			return lo;
		    } // partition

		} // Search
	 
	


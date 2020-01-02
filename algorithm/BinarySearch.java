//Binary Search
package com.bridgelabz.fellowshipprograms.algorithm;

public class BinarySearch {
	
 public static void main(String[]args)
 {
	 //Array of string type created.
	String str[]= {"kanu","plk","tanu","xyz"};
	
	//Value to search
	String search="plk";
	
	//Variable created to store the result of binary search.
	int index=binarySearch(str,search);
	if(index== -1)
	{
		System.out.println("Word not found");
	}
	else
		System.out.println("Word found at : "+index);

	}
static int binarySearch(String[] arr, String x) 
{ 
    int l = 0, r = arr.length - 1; 
    while (l <= r) { 
        int mid = l + (r - l) / 2; 

        int res = x.compareTo(arr[mid]); 

        // Check if x is present at middle 
        if (res == 0) 
            return mid; 

        // If x greater, ignore left half 
        if (res > 0) 
            l = mid + 1; 

        // If x is smaller, ignore right half 
        else
            r = mid - 1; 
    } 

    return -1; 
} 
}
//Insertion sort
package com.bridgelabz.fellowshipprograms.algorithm;

public class InsertionSorting 
{
	 public static void main(String args[]) 
	 { 
	     //Array of type int initialized.
		 int arr[] = { 12, 11, 13, 5, 6 }; 
	    //Calling methods
	     sort(arr); 
	     printArray(arr); 
	 }
	    
	
 //Function to sort array using insertion sort
static void sort(int arr[]) 
 { 
     int n = arr.length; 
     for (int i = 1; i < n; ++i) 
     { 
         int key = arr[i]; 
         int j = i - 1; 
// Shift elements of array that are greater than key value, to one position ahead of their current position 
          
            
         while (j >= 0 && arr[j] > key) 
         { 
             arr[j + 1] = arr[j]; 
             j = j - 1; 
         } 
         arr[j + 1] = key; 
     } 
 
 } 

 // function to print array  
 static void printArray(int arr[]) 
 { 
     int n = arr.length; 
     for (int i = 0; i < n; ++i) 
         System.out.print(arr[i] + " "); 

     System.out.println(); 
 } 

 
	 
}
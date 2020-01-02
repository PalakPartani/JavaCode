package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[]args)
	{
Scanner scobj=new Scanner(System.in);
System.out.println("Enter the number");
int no=scobj.nextInt();
int arr[]=new int[no];
System.out.println("Enter the array");
for(int i=0;i<no;i++)
{
	arr[i]=scobj.nextInt();
}


int len=arr.length;
mergesort(arr,0,len-1);
System.out.println("The sorted array :");
for(int i=0;i<len;i++)
{
	System.out.println(arr[i]+"");
}
scobj.close();
	}


static void mergesort(int arr[],int l,int r)
{
	
	   if (l < r) 
	    	
	    { 
	        // Find the middle point 
	        int m = (l+r)/2; 

	        // Sort first and second halves 
	        mergesort(arr, l, m); 
	        mergesort(arr , m+1, r); 

	        // Merge the sorted halves 
	        merge(arr, l, m, r);
	    }
	

}

static void merge(int arr[],int l,int mid,int r)
{
	   // Find sizes of two subarrays to be merged 
        int n1 = mid - l + 1; 
        int n2 = r - mid; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[mid + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
 
}

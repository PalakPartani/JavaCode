package com.bridgelabz.fellowshipprograms.DataStructure;
import com.bridgelabz.fellowshipprograms.utility.DataStructureUtility;

public class Prime2DArray {

	public static void main(String[] args) {
		
		int[][] prime= new int[10][];

		int start = 0, end = 100, count2 = 0, x = 0;

		for (int i = 0; i < 10; i++) {
			//declaring array length of each row
			
			for (int j = start; j < end; j++) {
				
				if (DataStructureUtility.isPrime(j)) {
					
					for (int j2 = 0; j2 < 1000; j2++) {
					
						if (DataStructureUtility.isPrime(j2)) {
							
							x = 0;

						}

					}
					if (x == 0) {
						count2++;
					}
				}

			}

			
			prime[i] = new int[count2];
			
			count2 = 0;
			start = end + 1;
			end = end + 100;
		}
		//inserting elements into an array
		start = 0;
		end = 100;
		count2 = 0;
		x = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = start; j < end; j++) {
				if (DataStructureUtility.isPrime(j)) {
					String s1 = String.valueOf(j);

					for (int j2 = 0; j2 < 1000; j2++) {
						if (DataStructureUtility.isPrime(j2)) {
							String s2 = String.valueOf(j2);
							x = 0;
							
						}

					}
					if (x == 0) {
						prime[i][count2] = j;
						count2++;
					}
				}

			}

		
			count2 = 0;
			start = end + 1;
			end = end + 100;
		}
		// printing arrays
		for (int i = 0; i < prime.length; i++) {
			for (int j = 0; j < prime[i].length; j++) {
				System.out.print(prime[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	}




	
	

	
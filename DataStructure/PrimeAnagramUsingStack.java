package com.bridgelabz.fellowshipprograms.DataStructure;
import com.bridgelabz.fellowshipprograms.utility.DataStructureUtility;

public class PrimeAnagramUsingStack {

	public static void main(String[]args)
	{
		Stack stack=new Stack(); //Stack class obj  created
		//array for anagram no that are prime
		int[]Stack= new int[10];
		
		
		
		
			int start = 0, end = 100, count1 = 0, count2 = 0, x = 0;

			for (int i = 0; i < 10; i++) {
				//declaring array length of each row
				for (int j = start; j < end; j++) {
					if (DataStructureUtility.isPrime(j)) {
						String s1 = String.valueOf(j);
						for (int j2 = 0; j2 < 1000; j2++) {
							if (DataStructureUtility.isPrime(j2)) {
								String s2 = String.valueOf(j2);
								x = 0;
								if (DataStructureUtility.isAnagram(s1, s2)) {
									count1++;
									x = 1;
									break;
								}
							}

						}
						if (x == 0) {
							count2++;
						}
					}

				}

				Stack[i] = new int[count1];
				
				count1 = 0;
				count2 = 0;
				start = end + 1;
				end = end + 100;
			}
			//inserting elements into an array

		    for(int n:Stack)
		    {
			stack.push(data);
			start = 0;
			end = 100;
			count1 = 0;
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
								if (DataStructureUtility.isAnagram(s1, s2)) {
									Stack[i]= j;
									count1++;
									x = 1;
									break;
								}
							}

						}
						if (x == 0) {
							Stack[i] = j;
							count2++;
						}
					}

				}

				count1 = 0;
				count2 = 0;
				start = end + 1;
				end = end + 100;
			}

		    }
	
	stack.pop();
	// printing arrays
	System.out.println("Prime Anagram numbers are :");

	for (int i = 0; i < Stack.length; i++) {
		//for (int j = 0; j < Stack[i].length; j++) {
			System.out.print(Stack[i]+ " ");
		}
		System.out.println();
	}
//}

	}
	


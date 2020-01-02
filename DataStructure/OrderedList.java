package com.bridgelabz.fellowshipprograms.DataStructure;
import com.bridgelabz.fellowshipprograms.utility.DataStructureUtility;
com.bridgelabz.fellowshipprograms.utility.LinkedList;

import java.io.IOException;
import java.util.Scanner;

public class OrderedList {

	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		LinkedList<Integer> list = new LinkedList<Integer>();
		String[] strArr = null;

		try {
			strArr = (utility.readFile(
					"/Users/Admin/Desktop/FellowshipPrograms/FellowshipPrograms/src/com\\bridgelabz\\fellowshipprograms\",\r\n" + 
					"")
					.split(","));

		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] integerArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			integerArr[i] = Integer.parseInt(strArr[i]);
			list.add(integerArr[i]);
		}
		int size = integerArr.length;
		System.out.println(list.show());
		System.out.println("\nSorting");
		list.sort(size);
		System.out.println(list.show());
		
		System.out.println("\nEnter key to search in list:");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		size = list.searchNode(key, size);
		
		scanner.close();
		
		System.out.println("\nSorting");
		list.sort(size);

		System.out.println(list.show());
		String str = list.returnListInString();
		try {
			utility.writeFile(
					"/Users/Admin/Desktop/FellowshipPrograms/FellowshipPrograms/src/com\bridgelabz\fellowshipprograms",
					str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

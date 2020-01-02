package com.bridgelabz.fellowshipprograms.DataStructure;
import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.DataStructureUtility1;

public class CalenderQueue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, month;
		boolean isLeapYear;
		int days;
		int day;
		int[] daysPerYear = { 31, 28, 30, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter month");
		month = scanner.nextInt();
		if (month > 0 && month <= 12) {
			System.out.println("Enter year");
			year = scanner.nextInt();
			if (year > 1582 && year < 9999) {
				isLeapYear = DataStructureUtility1.isLeapYear(year);
				if (isLeapYear && month == 2) {
					days = 29;
					day = DataStructureUtility1.calculateDayOfWeek(1, month, year);
					DataStructureUtility1.printCalendarUsingQueue(day, days);

				} else {
					days = daysPerYear[month - 1];
					day = DataStructureUtility1.calculateDayOfWeek(1, month, year);
					DataStructureUtility1.printCalendarUsingQueue(day, days);
				}
			} else
				System.out.println("please enter valid year");
		} else
			System.out.println("Please enter valid month");

		scanner.close();
	}
}

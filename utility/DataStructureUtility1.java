package com.bridgelabz.fellowshipprograms.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.fellowshipprograms.algorithm.QueueImplementedUsingLinkedList;

public class DataStructureUtility1 {

	public String readFile(String path) throws Exception
	{
		String str="";
		BufferedReader bufferedreader = new BufferedReader(new FileReader(path));
		str=bufferedreader.readLine();
		bufferedreader.close();
		return str;
	}
	
	public String writeFile()
	{
		
	}
public static void printCalendarUsingQueue(int day, int days) {
	

QueueImplementedUsingLinkedList<String> weekDayQueue = new QueueImplementedUsingLinkedList<String>();
QueueImplementedUsingLinkedList<String> weekDateQueue = new QueueImplementedUsingLinkedList<String>();
String weekdaystr = "SUN MON TUE WED THU FRI SAT";
String[] weekdaystrarr = weekdaystr.split(" ");
for (int i = 0; i < weekdaystrarr.length; i++) {
weekDayQueue.enQueue(weekdaystrarr[i]);
}
weekDayQueue.show();
switch (day) {
case 0:

for (int i = 1; i <= days; i++) {
if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i % 7 == 0) {
weekDateQueue.enQueue("\n");
}
}
break;
case 1:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i == 6 || i == 13 || i == 20 || i == 27) {
weekDateQueue.enQueue("\n");
}
}
break;
case 2:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i == 5 || i == 12 || i == 19 || i == 26) {
weekDateQueue.enQueue("\n");
}
}
break;
case 3:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i == 4 || i == 11 || i == 18 || i == 25) {
weekDateQueue.enQueue("\n");
}
}
break;
case 4:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i == 3 || i == 10 || i == 17 || i == 24) {
weekDateQueue.enQueue("\n");
}
}
break;
case 5:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30) {
weekDateQueue.enQueue("\n");
}
}
break;
case 6:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i == 1 || i == 8 || i == 15 || i == 22 || i == 29) {
weekDateQueue.enQueue("\n");
}
}
break;
}

System.out.println(weekDateQueue.showQueueWithoutSpace());
}

/**
* Purpose: method for printing calendar using queue and the put queue into the
* stack 1 and the also put that stack data into stack 2
* 
* @param day input from program
* @param days input from program
*/
/*public static void printCalendarUsingQueueDoubleStack(int day, int days)
{
QueueImplementedUsingLinkedList<String> weekDayQueue = new QueueImplementedUsingLinkedList<String>();
StackImplementUsingLinkedList<String> weekDayStack1 = new StackImplementUsingLinkedList<String>();
StackImplementUsingLinkedList<String> weekDayStack2 = new StackImplementUsingLinkedList<String>();
QueueImplementedUsingLinkedList<String> weekDateQueue = new QueueImplementedUsingLinkedList<String>();
StackImplementUsingLinkedList<String> weekDateStack1 = new StackImplementUsingLinkedList<String>();
StackImplementUsingLinkedList<String> weekDateStack2 = new StackImplementUsingLinkedList<String>();
String weekdaystr = "SUN MON TUE WED THU FRI SAT";
String[] weekdaystrarr = weekdaystr.split(" ");
for (int i = 0; i < weekdaystrarr.length; i++) {
weekDayQueue.enQueue(weekdaystrarr[i]);
}
//weekDayQueue.show();
for (int i = 0; i < weekdaystrarr.length; i++) {
String str = weekDayQueue.get();
weekDayQueue.deQueue();
weekDayStack1.push(str);
}
//weekDayStack1.show();
for (int i = 0; i < weekdaystrarr.length; i++) {
if (!weekDayStack1.isEmpty()) {
weekDayStack2.push(weekDayStack1.peek());
weekDayStack1.pop();
}

}
weekDayStack2.show();
switch (day) {
case 0:

for (int i = 1; i <= days; i++) {
if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}
if (i % 7 == 0) {

}
}
for (int i = 1; i <= days; i++) {
String str = weekDateQueue.get();
weekDateQueue.deQueue();
weekDateStack1.push(str);
}
for (int i = 1; i <= days; i++) {
weekDateStack2.push(weekDateStack1.peek());
if (i % 7 == 0) {
weekDateStack2.push("\n");
}
if (!weekDateStack1.isEmpty()) {
weekDateStack1.pop();
}

}
weekDateStack2.showStackWithoutSpace();
break;
case 1:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}

}
for (int i = 1; i <= days; i++) {
String str = weekDateQueue.get();
weekDateQueue.deQueue();
weekDateStack1.push(str);
}
for (int i = 1; i <= days; i++) {
weekDateStack2.push(weekDateStack1.peek());
if (i == 6 || i == 13 || i == 20 || i == 27) {
weekDateStack2.push("\n");
}
if (!weekDateStack1.isEmpty()) {
weekDateStack1.pop();
}

}

weekDateStack2.showStackWithoutSpace();
break;
case 2:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}

}
for (int i = 1; i <= days; i++) {
String str = weekDateQueue.get();
weekDateQueue.deQueue();
weekDateStack1.push(str);
}
for (int i = 1; i <= days; i++) {
weekDateStack2.push(weekDateStack1.peek());
if (i == 5 || i == 12 || i == 19 || i == 26) {
weekDateStack2.push("\n");
}
if (!weekDateStack1.isEmpty()) {
weekDateStack1.pop();
}

}
weekDateStack2.showStackWithoutSpace();
break;
case 3:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}

}
for (int i = 0; i < days; i++) {
String str = weekDateQueue.get();
weekDateQueue.deQueue();
weekDateStack1.push(str);
}
for (int i = 0; i < days; i++) {
weekDateStack2.push(weekDateStack1.peek());
if (i == 4 || i == 11 || i == 18 || i == 25) {
weekDateStack2.push("\n");
}
if (!weekDateStack1.isEmpty()) {
weekDateStack1.pop();
}

}
weekDateStack2.showStackWithoutSpace();
break;
case 4:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}

}
for (int i = 0; i < days; i++) {
String str = weekDateQueue.get();
weekDateQueue.deQueue();
weekDateStack1.push(str);
}
for (int i = 0; i < days; i++) {
weekDateStack2.push(weekDateStack1.peek());
if (i == 3 || i == 10 || i == 17 || i == 24) {
weekDateStack2.push("\n");
}
if (!weekDateStack1.isEmpty()) {
weekDateStack1.pop();
}

}
weekDateStack2.showStackWithoutSpace();
break;
case 5:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}

}
for (int i = 0; i < days; i++) {
String str = weekDateQueue.get();
weekDateQueue.deQueue();
weekDateStack1.push(str);
}
for (int i = 0; i < days; i++) {
weekDateStack2.push(weekDateStack1.peek());
if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30) {
weekDateStack2.push("\n");
}
if (!weekDateStack1.isEmpty()) {
weekDateStack1.pop();
}

}
weekDateStack2.showStackWithoutSpace();
break;
case 6:

System.out.print(" ");
for (int i = 1; i <= days; i++) {

if (i <= 9) {
weekDateQueue.enQueue(i + " ");
} else {
weekDateQueue.enQueue(i + " ");
}

}
for (int i = 0; i < days; i++) {
String str = weekDateQueue.get();
weekDateQueue.deQueue();
weekDateStack1.push(str);
}
for (int i = 0; i < days; i++) {
weekDateStack2.push(weekDateStack1.peek());
if (i == 1 || i == 8 || i == 15 || i == 22 || i == 29) {
weekDateStack2.push("\n");
}
if (!weekDateStack1.isEmpty()) {
weekDateStack1.pop();
}

}
weekDateStack2.showStackWithoutSpace();
break;
}
*/
}

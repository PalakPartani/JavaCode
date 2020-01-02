package com.bridgelabz.fellowshipprograms.DataStructure;
import com.bridgelabz.fellowshipprograms.utility.UtilityNew;
import java.io.*;
import java.util.*;

//list to array convrt
//arry to string den print
public class Unordered1 {

		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);

			String[] s1 = null;
			String s = UtilityNew.reader("\\C:\\Users\\Admin\\Desktop\\FellowshipPrograms\\FellowshipPrograms\\simpleparenthesisfile.txt");

			s1 = s.split(" ");

			// Created object of a Generic LinkedList
			LinkedList<String> list = new LinkedList<String>();
			for (int i = 0; i < s1.length; i++) {
				list.insert(s1[i]);

			}

			// Printing LinkedList
			System.out.println("List is :");
			list.show();

			// Taking Input to be searched in list
			System.out.println();
			System.out.println("Enter the Word to be searched");
			String search = sc.nextLine();
			int i = 0, x = 0;
			Node<String> newnode = list.head;
			while (newnode != null) {
				if (newnode.data.equals(search)) {
					System.out.println("Deleting...");
					list.deleteAt(i);
					x = 1;
					break;
				} else {
					
					i++;
					newnode = newnode.next;
				}
			}
			if (x == 0) {
				System.out.println("Inserting...");
				list.insert(search);
			}
			String answer="";
			
			list.show();
			Node<String> node=list.head;
			while(node!=null)
			{
				answer=answer+node.data;
			}
			System.out.println("Writing in file ...");
			UtilityNew.writer("\\C:\\Users\\Admin\\Desktop\\FellowshipPrograms\\FellowshipPrograms\\simpleparenthesisfile.txt", answer);
			sc.close();
		}

	}

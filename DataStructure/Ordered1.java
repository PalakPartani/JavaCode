package com.bridgelabz.fellowshipprograms.DataStructure;
import com.bridgelabz.fellowshipprograms.utility.UtilityNew;
import java.io.*;
import java.util.*;
public class Ordered1
{
	
	public static void sort(LinkedList<Integer> list)
	{
		int temp=0;
		for (Node<Integer> j = list.head; j!=null; j=j.next)
		{
			for (Node<Integer> j2 = j.next; j2!=null; j2=j2.next)
			{
				if(j.data>j2.data)
				{
					temp=j.data;
					j.data=j2.data;
					j2.data=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
	//	File f=new File("\\C:\\Users\\Admin\\Desktop\\FellowshipPrograms\\FellowshipPrograms\\orderlist.txt");
		
		//Created Linked List
		
		int[] num=new int[6];
	    FileReader fr=new FileReader("\\C:\\Users\\Admin\\Desktop\\FellowshipPrograms\\FellowshipPrograms\\orderlist.txt");    
        int i;    
        
        System.out.println("List is :");
        while((i=fr.read())!=-1)    
        System.out.print((char)i); 
		//Scanner sc=new Scanner(f);
		//(new FileReader("\\C:\\Users\\Admin\\Desktop\\FellowshipPrograms\\FellowshipPrograms\\orderlist.txt"));
		list.add();
	
		
		 
		
		    public void readFileContents(String fileName) throws FileNotFoundException {
		
		        Scanner in = null;
		
		 
	
		        try {
		
		            in = new Scanner(new File(fileName));
		
		 
		    while (in.hasNextLine()) {
		
		                insertBack(in.nextLine());
		
		            }
		
		        } finally {
		
		            try {
		
		                in.close();
		
		            } catch (Exception e) { /* ignore */
		
		            }
		
		        }
		
		    }

		
		
		
		
        System.out.println("Sorted List is :");
	   
        sort(list);
		list.show();
		
		System.out.println();
		System.out.println("Enter the Number to be Searched");
		Scanner sc1=new Scanner(System.in);
		int search=sc1.nextInt();
		int pos=0,x=0;
		for (Node<Integer> k = list.head; k.next!=null; k=k.next) {
			if(k.data==search)
			{
				System.out.println("Deleting "+search+" .....");
				list.deleteAt(pos);
				x=1;
				break;
			}
			else
			{
				pos++;
			}
		}
		if(x==0)
		{
			System.out.println("Inserting "+search+" .....");
			list.insert(search);
		}
		sort(list);
		list.show();
		sc1.close();
		//sc.close();
	}

}

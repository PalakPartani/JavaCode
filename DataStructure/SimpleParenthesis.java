package com.bridgelabz.fellowshipprograms.DataStructure;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SimpleParenthesis {

	public static void main(String[]args) throws IOException
	{
		LinkedList<Character> list = new LinkedList<>();
		//File f=new File("Users\Admin\Desktop\FellowshipPrograms\FellowshipPrograms\simpleparenthesisfile.txt");
	  // String path="C:\\Users\\Admin\\Desktop\\FellowshipPrograms\\FellowshipPrograms\\simpleparenthesisfile.txt";
	////	path = path.replace("\\", "/");
		//File f=new File(path);
		//C:\Users\Admin\Desktop\FellowshipPrograms\FellowshipPrograms
					//taking fileobj as arguement
		BufferedReader br=new BufferedReader(new FileReader("\\C:\\Users\\Admin\\Desktop\\FellowshipPrograms\\FellowshipPrograms\\simpleparenthesisfile.txt"));  //taking frobject as arguement
		String s=br.readLine();
		int y=0;
		//String s=br.readLine();
		System.out.println(s);
		
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			y=0;
			if(s.charAt(i)=='(')
			{
				list.insert(')');
			}
			else if(s.charAt(i)==')')
			{
				if(list.deleteAtBooleanReturn(0))
				{
					list.deleteAt(0);
					y=1;
				}
			}
	}
		Node<Character> node=list.head;
		{
			int x=0;
			while(node!=null)
			{
				x++;
				node=node.next;
			}
			if(x==0 && y==1)
				System.out.println("True");
			else
				System.out.println("False");
		}
		
}
}

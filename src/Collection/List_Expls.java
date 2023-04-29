package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class List_Expls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array List
		List<String> l1 = new ArrayList<String>(); //Creating arraylist
		l1.add("Kartik");	//Adding objects in arraylist
		l1.add("Rohit");
		l1.add("Ravi");
		l1.add("Rahul");
		l1.add("Raj");
		System.out.println("Array List"+l1);	//Print arraylist
		
		//Traversing Array list through Iterator
		Iterator itr = l1.iterator();
		System.out.println("Traversing Array List through Iterator-->");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


		
		
		//Stack
		Stack<String> s=new Stack<String>();
		s.push("Welcome");
		s.push("to");
		s.push("Cth");
		System.out.println(s);
		
		
	}

}

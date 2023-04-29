package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Linked List
				//It can store duplicate values
				List<String> l2 = new LinkedList<String>(); //Create a Linked list
				l2.add("Kartik");	//Add elements in Linked list
				l2.add("Rohit");
				l2.add("Kartik");
				l2.add("Rohit");
				l2.add("Kartik");
				System.out.println("Linked List = "+l2);	// Print Linkede List 
				
				//Traversing Array list through Iterator
				Iterator itr1 = l2.iterator();
				System.out.println("Traversing Linked List through Iterator-->");
				while(itr1.hasNext()) {
					System.out.println(itr1.next());
				}
	}

}

package Collection;


//Underflow
//peek() returns head of the queue
//poll() returns and remove head but does not throws an exception while it returns null if queue is empty
//remove()  same as poll() + exception if queue is empty

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q = new LinkedList<String>();	//Creating a queue
		q.add("Java");	//Adding elements in queue
		q.add("Python");
		q.add("Html");
		q.add("Css");
		System.out.println(q); //Printing queue
		
		System.out.println("\nHead element of Queue: "+q.peek()); //Printing the queue head element
		
		System.out.println("\nPop the head element from the queue:"+q.poll()); //It pop the queue head element\
		
		System.out.println();
		//Traverse Queue using iterator
		Iterator<String> itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		q.clear();
		System.out.println("Queue is empty or not: "+q.isEmpty());	//It return boolean value if queue is empty it give true if queue is not empty it give false
		System.out.println("\nPop the head element from the queue: "+q.poll());	//It return and remove the value if the queue is empty it give null or 0
		System.out.println("\nRemove the head element fronm the queue: "+q.remove());	//It not return anything , it's showing an exception if the queue is empty
		
		

	}

}

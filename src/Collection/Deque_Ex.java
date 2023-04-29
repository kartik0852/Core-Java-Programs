package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> dq = new LinkedList<String>();
		
		dq.add("Java");
		dq.addLast("Pyhton");
		dq.addFirst("C++");
		dq.add("Html");
		dq.addFirst("CSS");
		//dq.addLast("Angular");
		System.out.println(dq);
		
		System.out.println("\nShoow the head element in the dequeue: "+dq.peek()+"\n");
		
		//remove last element in the dequeue
		System.out.println("Remove last element in the dequeue:  "+dq.removeLast());
		System.out.println("After remove the last element:       "+dq);
		
		//remove First element in the dequeue
		System.out.println("Remove first element in the dequeue: "+dq.removeFirst());
		System.out.println("After remove the first element:      "+dq);
		
		
		//pop last element in the dequeue
		System.out.println("Poll last element in the dequeue:    "+dq.pollLast());
		System.out.println("After poll the last element:         "+dq);
		
		//pop first element in the dequeue
		System.out.println("Poll first element in the dequeue:   "+dq.pollFirst());
		System.out.println("After poll the first element:        "+dq);

	}

}

package Collection;

import java.util.Stack;

public class Stack_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		boolean res = s.isEmpty();
		System.out.println("Stack is empty? True or False? : "+res);
		
		s.push(101);
		s.push(102);
		s.push(103);
		s.push(104);
		s.push(105);
		s.push(106);
		
		System.out.println("Elements in stack : "+s);
		
		res = s.isEmpty();
		System.out.println("Stack is empty? True or False? : "+res);

	}

}

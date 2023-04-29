package Collection;

//LAst-In-First-Out Using Push and Pop operation
//Push the elements in the stack

//	|Java   | --> First Out		
//	---------
//	|core   |
//	---------
//	|the    |
//	---------
//	|to     |
//	---------
//	|Welcome| <--Last In
//	---------

//After Pop the element from the stack

//	|	    | --> Remove the "Java" from the stack which is top on the stack
//	---------
//	|core   | --> First Out
//	---------
//	|the    |
//	---------
//	|to     |
//	---------
//	|Welcome| -->Last In
//	---------


import java.util.Stack;

public class Stack_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s = new Stack<String>();		//Creating a Stack
		s.push("Welcome");		//Push the elements in the stack
		s.push("to");
		s.push("the");
		s.push("core");
		s.push("Java");
		System.out.println(s);		//Printing the elements
		
		//peek() method, It looks at the element that is at the top in the stack.
		String s1 = s.peek();
		System.out.println("\nElement at top: "+s1);
		
		//Returns: It returns the object location from the top of the stack.
		//If it returns -1, it means that the object is not on the stack.
		int s2 = s.search("Java");
		System.out.println("\nLocation of element: "+s2);
		
		s.pop();				//Pop the element from the stack so it remove the "Java" from the stack
		System.out.println("\n"+s);	//Printing after pop the element
		
		s.pop();				//Pop the element from the stack so it remove the "core" from the stack
		System.out.println("\n"+s);	//Printing after pop the elemen+t
		
		s.pop();				//Pop the element from the stack so it remove the "the" from the stack
		System.out.println("\n"+s);	//Printing after pop the element
		
		s.pop();				//Pop the element from the stack so it remove the "to" from the stack
		System.out.println("\n"+s);	//Printing after pop the element

	}

}

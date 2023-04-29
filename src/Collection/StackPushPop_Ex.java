package Collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackPushPop_Ex {
	
	//Create a push element method where we push the element in the stack using method
	static void pushelemnt(Stack s,int x) { 	//Here we use 2 arguments Stack and integer
		
		//Invoke push method()
		s.push(x);							//Push the elements in the stack
		System.out.println("push -> "+x);	//It print the element which we enter to push
		
		//print modified stack
		System.out.println("Stack: "+s);	//It print the stack after store the element
	}
	
	//Performing pop operation
	static void popelemnt(Stack s) {	//Here we create another method , It helps to pop the element frot he stack
		//System.out.print("pop -> ");
		
		//Invoking pop() method
		Integer x = (Integer) s.pop();	//Here it pop the element
		System.out.println("Pop ->"+x);	//Here it print which element is remove or pop
		
		//Modified stack
		System.out.println("Stack: "+s);	//It print the stack after remove the elements
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		System.out.println("Stack: "+s);
		
		//Pushing elements into stack 
		pushelemnt(s,20);	//We create the method 
		pushelemnt(s,30);
		pushelemnt(s,40);
		pushelemnt(s,50);
		pushelemnt(s,60);
		pushelemnt(s,70);
		pushelemnt(s,80);
		
		//popping elements from stack
		while(!s.isEmpty()) {		//Here we use while loop so it pop the elements from stack until the stack is empty
		popelemnt(s);				//Here we call the pop element method 
		}
		
		
		//Here we use try and Catch block
		//It give an exception when stack is empty
		try {
			popelemnt(s);
		} catch (EmptyStackException e) {
			// TODO Auto-generated catch block
			System.out.println("Stack is Empty......");
			e.printStackTrace();
		}
		

	}

}

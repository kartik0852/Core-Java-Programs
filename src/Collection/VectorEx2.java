package Collection;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an empty vector with initial capacity 4
		Vector<String> v = new Vector<String>(4);
		
		//Adding elements using add() method of List
		v.add("Java");
		v.add("Python");
		v.add("C++");
		v.add("C");
		
		//Check size and capacity
		System.out.println("Size is : "+v.size());
		System.out.println("Default capacity is : "+v.capacity());
		
		//Display Vector elements
		System.out.println("Vector elements is : "+v);
		
		//Adding elements using addElement() method of Vector
		v.addElement("Basic Java");
		v.addElement("Core Java");
		v.addElement("Advance Java");
		
		//Again Check size and capacity
		System.out.println("Size is : "+v.size());
		System.out.println("Default capacity is : "+v.capacity());
		
		//Again Display Vector elements
		System.out.println("After adding more Vector elements : "+v);
		
		//Checking if Tiger is present or not in the Vector
		if(v.contains("Basic Java")) {
			System.out.println("Basic Java is present at the index : "+v.indexOf("Basic Java"));
		}
		else {
			System.out.println("Java is not present in the list.");
		}
		
		//Get the first element
		System.out.println("First element is : "+v.firstElement());
		
		//Get the last element
		System.out.println("Last element is : "+v.lastElement());
		
		
		

	}

}

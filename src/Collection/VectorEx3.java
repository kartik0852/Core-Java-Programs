package Collection;

import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<Integer>();
		v.addElement(100);
		v.addElement(200);
		v.addElement(300);
		v.addElement(400);
		v.addElement(500);
		v.addElement(600);
		v.addElement(700);
		v.addElement(800);
		v.addElement(900);
		v.addElement(1000);
		v.addElement(1000);
		
		//Check Size of Vector
		System.out.println("Check Size vector : "+v.size());
		
		//Display the vector elements
		System.out.println("Value in Vector : "+v);
		
		
		//Use remove() method to delete the first occurence of an elements
		System.out.println("Remove fist occurence of element 200 : "+v.remove((Integer)200));
		
		//Display the vector elements after remove() method
		System.out.println("Values in Vector after removal : "+v);
		
		//Remove the element at index 5
		System.out.println("Remove element at index 5 : "+v.remove(5));
		System.out.println("New Value list in vector : "+v);
		
		//Remove an element
		v.removeElementAt(7);
		System.out.println("Vector element after removal : "+v);
		
		//Get the HashCode for this vector
		System.out.println("Hash Code of this vector : "+v.hashCode());
		
		//GEt the element at specified index
		System.out.println("Elements at index 1 is : "+v.get(1));
		
		//Again Check Size of Vector
		System.out.println("Check Size after removal of elements : "+v.size());
		
	}

}

package Collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();	//Creating a Generic ArrayList
		
		//Void add("...")
		al.add("Welcome");	//Adding object in ArrayList
		al.add("to");
		al.add("the");
		al.add("Java");
		System.out.println("Array List: "+al);	//Printing the ArrayList object
		
		System.out.println("\n"+al.remove(2));

		
		//lastIndexOf(Object o)
		System.out.println("\nPrint the index no of the element if there is no element so it print '-1': "+al.lastIndexOf("Java"));
		
		//void add(index, E element)
		al.add(3,"Kartik");	//Printing Kartik at index 3 in array list
		System.out.println("\nAdd the element -'Kartik' at index -3:"+al);	//And printing again the ArrayList
		
		//get(index)
		System.out.println("\nPrint the elements which is placed in index -2 = "+al.get(2));
		
		System.out.println("\nChecking array is empty or not so it print TRUE OR FALSE = "+al.isEmpty());
		
		
		
		//coid clear()
		al.clear();	//Clear all the elements in the array list
		System.out.println("\nClear all the elements of the array list: "+al);
		
		//isEmpty()
		System.out.println("\nAfter using clear() method checking array is empty or not so it print TRUE OR FALSE = "+al.isEmpty()); 
	}

}

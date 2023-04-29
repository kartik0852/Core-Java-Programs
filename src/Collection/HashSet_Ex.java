package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();	//Creating a Generic Hash Set and add elements
		hs.add("Kartik");
		hs.add("Rohit");
		hs.add("Kartik");
		hs.add("Ravi");
		hs.add("Rahul");
		System.out.println(hs);	//It print the elements on the basis of HASH CODE and doesn't contain insertion order
								//And it contains only UNIQUE elements
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		HashSet h = new HashSet();	//Creating a Non - Generic Hash Set and add elements
		h.add("Kartik");
		h.add(1);
		h.add(1.5);
		h.add("a");
		h.add("Kartik");
		for(Object ob:h) {
			System.out.println(ob);
		}
		System.out.println("\nOriginal set = "+h);
		
		System.out.println("\n'h.clone()' A shallow copy of this HashSet instance: the elements themselves are not cloned = "+h.clone()); //It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
		/*
		 * for (Object object : h) {
		 * 
		 * } System.out.println(h);
		 */
		
		hs.addAll(h);	//add set 2 element in set 1 
		System.out.println("\n'hs.addAll(h)' Printing hs elements after add h elements = "+hs);		//Printing se1 after add set 2 elements
		
		
		
		System.out.println("\n'h.contains(h)' is used to return true if this set contains the specified element = "+h.contains(h));	//It is used to return true if this set contains the specified element.
		
		System.out.println("\n'h.size()' is used to return the number of elements in the set = "+h.size());	//It is used to return the number of elements in the set.
		
		System.out.println("\n'h.remove(1)' is used to remove the specified element from this set if it is present = "+h.remove(1));	//It is used to remove the specified element from this set if it is present.
		System.out.println("\nAfter removing element on index 1"+h);	//After removing element on index 1

	}

}

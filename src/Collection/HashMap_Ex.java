package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> m = new HashMap();	//Creating a HashMap
		
		m.put(1,"Java");		//Put the (Key, Value)
		m.put(2, "Python");
		m.put(3, "C++");
		m.put(4, "Html");
		m.put(4, "JavaScript"); //if we try to store duplicate key with another value, it will replace the value.
		System.out.println(m);	//Printing HashMap
		
		System.out.println(m.remove(3));
		
		List<Integer> l = new ArrayList<Integer>();		//Creating a Array List
		l.add(2); 										//Add element
		
		m.put(1,"Java");			//Here we put the list element on map KEY [m.put(Key,value)]								
		System.out.println(m);		//Printing after putting the element
		System.out.println();
		
		System.out.println(m.keySet());		//It print the all KEYS available in the HashMap
		System.out.println();
		
		System.out.println(m.values());		//It print the all values available in the HashMap 
		System.out.println();
		
		
		Set s = m.entrySet();		////Converting to set so that we can traverse
		
		System.out.println("Iterating HashMap:");	//IT iterate the elements using for loop
		
		for(Object ob:s) {
			System.out.println(ob);
		}
		
		System.out.println();
		System.out.println("Iterating HashMap:"); // Iterate the elements using Iterator class and while loop
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		
		
		}
	}

}

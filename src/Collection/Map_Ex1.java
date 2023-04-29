package Collection;
//Non -Generic Map example

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map m= new HashMap();	//Creating a Non Generic Map
		
		m.put(1, "Java");	//Putting key and values
		m.put(2, "Python");
		m.put(3, "C++");
		m.put(4, "JavaScript");
		
		System.out.println(m); 		//Printing map key and it's value
		System.out.println(m.containsKey(3));	//Printing true or false if the map contain key it give true if not contain it give false
		System.out.println(m.isEmpty()); 	//if map is empty is print true if not empty it print false
		
		System.out.println();
		 
		//Traversing Map
		Set s = m.entrySet();	//Converting to set so that we can traverse
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new HashMap(); 	//Creating a HashMap
		
		m.put(1,"Cs");			//Put the elements
		m.put(2, "Dsa");
		System.out.println(m);
		
		List l = new ArrayList();
		l.add("Computer Network");
		l.add("Java");
		m.put(1, l);
		System.out.println(m);
		
		List l1 = new ArrayList();
		l1.add("Data Structures and Algorithms Made Easy");
		m.put(2, l1);
		System.out.println(m);
		
		//System.out.println(m.keySet());
		Set s = m.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

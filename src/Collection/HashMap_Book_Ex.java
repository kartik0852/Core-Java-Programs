package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_Book_Ex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new HashMap();
		m.put(1,"CS Books");
		m.put(2,"Me Books");
		System.out.println(m);
		
		List l = new ArrayList();
		l.add("DSA");
		l.add("SQL");
		l.add("Java");
		m.put("CS Books", l);
		System.out.println(m);
		
		List l1 = new ArrayList();
		l1.add("Applied mechanics");
		l1.add("Strength of materials");
		l1.add("Theory of Machines");
		m.put("Me Books", l1);
		System.out.println(m);
		Set s = m.entrySet();
				
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
		
	}
}

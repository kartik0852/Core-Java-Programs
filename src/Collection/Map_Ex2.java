package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Non -Generic Map example

public class Map_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> m = new HashMap<>();
		m.put("Java ", " It isPlatform Independent");
		m.put("Python ", " It is a Interpreted");
		m.put("C++ ", " Platform Dependent");

		System.out.println(m);
		System.out.println();
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

package Collection;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(101, "Python");
		tm.put(100, "Java");
		tm.put(103, "C++");
		tm.put(102, "JavaScript");
		
		System.out.println(tm);
		
		Set s = tm.entrySet();
		for(Object ob:s) {
			System.out.println(ob);
		}

	}

}

package Collection;

import java.util.IdentityHashMap;
import java.util.Set;

public class EntrySetMethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object of IdentityHashMap class  
		IdentityHashMap<String, Integer> ah = new IdentityHashMap<String,Integer>();
		
		//Putting key-value pairs inside map
		ah.put("Java", 1);
		ah.put("is", 2);
		ah.put("the", 3);
		ah.put("best", 4);
		ah.put("programming", 5);
		ah.put("Language", 6);
		
		System.out.println("Before using entrySet() method : "+ah);
		
		//Creating a Set  
		Set s = ah.entrySet();
		
		//Displaying all entries in Set
		System.out.println("After using entrySet() method : "+s);

	}

}

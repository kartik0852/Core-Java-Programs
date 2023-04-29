package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer,String>();
		lm.put(1,"Java");		//Put the (Key, Value)
		lm.put(2, "Python");
		lm.put(3, "C++");
		lm.put(4, "Html");
		lm.put(4, "JavaScript"); //if we try to store duplicate key with another value, it will replace the value.
		System.out.println(lm);	//Printing HashMap
		
		System.out.println(lm.remove(3));
		
		for(Map.Entry m:lm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}

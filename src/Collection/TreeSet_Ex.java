package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// It contains unique elements and contain ascending order
		// Use here comparable interface .. elements should be of comparable...
		// 1 === can't be compare to java..
		Set s = new TreeSet();	//Creating Tree Set
		s.add("Welcome");		//Add elements in TreeSet
		s.add("to");
		s.add("Java");
		System.out.println(s); //Print tree set 
		
		Set s1 = new TreeSet();	//Creating Tree Set
		s1.add(50234);		//Add elements in TreeSet
		s1.add(35623);
		s1.add(12354);
		System.out.println(s1); //Print tree set 
		
	}

}

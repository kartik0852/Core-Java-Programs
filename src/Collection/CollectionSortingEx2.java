package Collection;

//Example to sort Wrapper class objects

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSortingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(Integer.valueOf(200));
		al.add(Integer.valueOf(102));
		al.add(250); 	//internally will be converted into objects as Integer.valueOf(250)
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

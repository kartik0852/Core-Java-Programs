package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Find Max() and Min() using Collection

public class CollectionMaxMinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(45);
		l.add(54);
		l.add(65);
		l.add(34);
		l.add(23);
		l.add(78);
		l.add(22);
		l.add(10);
		l.add(99);
		
		//Find max no in the list using collection.Min();
		System.out.println("Maximum no in the list : "+Collections.max(l));
		
		//Find min no in the list using collection.Min();
		System.out.println("Minimun no in the list : "+Collections.min(l));
	}

}

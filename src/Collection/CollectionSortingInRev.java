package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingInRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohit");
		al.add("Diwakar");
		al.add("Ayush");
		al.add("Kartik");
		System.out.println("Before Sorting in Reverse order : "+al);
		
		//Sorting list using collection class
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After Sorting in Reverse order : "+al);
	}

}

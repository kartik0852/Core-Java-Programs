package Collection;

//Sorting Collection

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohit");
		al.add("Noor");
		al.add("Ayush");
		al.add("Kartik");
		System.out.println("Before Sorting : "+al);
		
		//Sorting list using collection class
		Collections.sort(al);
		System.out.println("After Sorting : "+al);
		

	}

}

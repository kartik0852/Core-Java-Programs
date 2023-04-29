package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingEx3 implements Comparable<CollectionSortingEx3> {
	
	int id;
	String name;
	public CollectionSortingEx3(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int compareTo(CollectionSortingEx3 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<CollectionSortingEx3> al = new ArrayList<CollectionSortingEx3>();
		al.add(new CollectionSortingEx3(101, "Kartik"));
		al.add(new CollectionSortingEx3(102, "Rohit"));
		al.add(new CollectionSortingEx3(103, "Ravi"));
		al.add(new CollectionSortingEx3(104, "Kunal"));
		al.add(new CollectionSortingEx3(105, "Amit"));
		
		
		Collections.sort(al);
		for(CollectionSortingEx3 s:al) {
			System.out.print(s.name+" ");
			System.out.println(s.id);
		}

	}





	

}

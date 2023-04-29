package Collection;

//Collection Class

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("C");
		a.add("Core Java");
		a.add("Advance Java");
		System.out.println("Initial collection value : "+a);
		
		//Import Collections class and add more elements using Collection.addAll("");
		Collections.addAll(a, "Servlet","JSP");
		System.out.println("After adding elements collection value : "+a);
		
		//Create an array and add array elements in the collection values
		String ar[] = {"C#",".Net"};
		Collections.addAll(a, ar);
		System.out.println("After adding array collection value : "+a);
		
		
		

	}

}

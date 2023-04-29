package Collection;

import java.util.IdentityHashMap;
import java.util.Set;

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class EntrySetMethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an objects of Student class
		Student s1 = new Student(101, "Kartik");
		
		//Creating an Instance of identityHashMap
		IdentityHashMap<Integer, Student> ih = new IdentityHashMap<Integer,Student>();
		ih.put(1, s1);
		ih.put(2, new Student(102, "Rohit"));
		
		//Creating a Set
		Set s = ih.entrySet();
		System.out.println(s);
		
		for(IdentityHashMap.Entry<Integer, Student> a:ih.entrySet()) {
			System.out.println(a.getKey()+" : "+a.getValue());
		}

	}

}

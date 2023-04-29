package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Stud implements Comparable<Stud>{

	int rollno;
	String name;
	int age;
	
	public Stud(int rollno, String name, int age) {
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Stud o) {
		if(age==o.age)
			return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	
	

	
}

public class ComparableSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Stud> al = new ArrayList<Stud>();
		al.add(new Stud(101, "Kartik", 24));
		al.add(new Stud(102, "Rohit", 23));
		
		System.out.println("Before Sorting the list of student : "+al);
		
		Collections.sort(al);
		System.out.println("After sorint the list of studnet on the basis of age :-->");
		
		for(Stud st:al) {
			System.out.println("Roll no : "+st.rollno+" Name : "+st.name+" Age : "+st.age);
		}
		
		

	}

}

package Collection;

//Java Comparator Example (Non-generic Old Style)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Stud1{
	int rollno;
	String name;
	int age;
	
	Stud1(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}


class RollNoComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Stud1 s1 = (Stud1) o1;
		Stud1 s2 = (Stud1) o2;
		
	if(s1.rollno==s2.rollno)
		return 0;
	else if(s1.rollno>s2.rollno)
		return 1;
	else
		return-1;
	}	
}

class AgeComparator implements Comparator{
//It print the list min age to max age 
//If we want reverse the details by age
//we can just change the return type of (else if 1 to -1) and (else -1 to 1)
	@Override
	public int compare(Object o1, Object o2) {
		Stud1 s1 = (Stud1) o1;
		Stud1 s2 = (Stud1) o2;
		
	if(s1.age==s2.age)
		return 0;
	else if(s1.age>s2.age)
		return 1;
	else
		return -1;
	}	
}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Stud1 s1 = (Stud1) o1;
		Stud1 s2 = (Stud1) o2;
		return s1.name.compareTo(s2.name);
	}
	
}

public class ComparatorSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Stud1> al = new ArrayList<Stud1>();
		al.add(new Stud1(110, "Kartik", 24));
		al.add(new Stud1(102, "Rohit", 23));
		al.add(new Stud1(108, "Aman", 25));
		
		
		System.out.println("Sorting By Age--> ");
		Collections.sort(al, new AgeComparator());
		for(Stud1 data:al) {
			System.out.println(data.rollno+" "+data.name+" "+data.age);
		}
		
		System.out.println("\nSorting By Name -->");
		Collections.sort(al, new NameComparator());
		for(Stud1 data:al) {
			System.out.println(data.rollno+" "+data.name+" "+data.age);
		}
		
		System.out.println("\nSorting By RollNo -->");
		Collections.sort(al, new RollNoComparator());
		for(Stud1 data:al) {
			System.out.println(data.rollno+" "+data.name+" "+data.age);
		}

	}

}

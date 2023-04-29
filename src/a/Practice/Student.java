package a.Practice;

//Printing data using METHOD......
import java.util.Scanner;

public class Student {
	
	int id;
	String name;
	
	void print() {
		System.out.println("Name: "+name+"\nId: "+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.id=sc.nextInt();
		s.name=sc.next();
		s.print();
	}

}

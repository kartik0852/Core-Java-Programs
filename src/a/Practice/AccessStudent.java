//This class is different package class and we access other package class in this class
//So firstly we "import package with class"
//And in this it access only public but it also access protected if we "extends class" or 
//we create a child class in parent class and create a object of parent class so it access also "Protected values" which we create in other class
//And if we don't extends the class OR we don't creating child class in parents class so it don't access the "Protected values from other package's class"


package a.Practice;

import java.util.Scanner;

import Access_modifiers.Access_St;

public class AccessStudent extends Access_St{            //Here we creating a child class in parent class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Student Data:");
		
		AccessStudent ts1 = new AccessStudent();             //Here we creating an object of parent class name 
		
		ts1.id =sc.nextInt();                 //protected int id;
		ts1.name=sc.next();					  //public string name;
		//ts1.rollno=sc.next();			      //default int roll no;
		//
		
		ts1.display();							//display = protected
		
		System.out.println();
		System.out.println("Enter Second Student Data:");
		
		AccessStudent ts2 = new AccessStudent();
		
		ts2.id =sc.nextInt();
		ts2.name=sc.next();
		//ts2.rollno=sc.next();
		
		ts2.display();
	}

}
//Access Modifier, We access this class value in same package other class and other package's class  

//Creating a class Student and take the data from user


//importing | Same Class  |  Same Package | Outside the packages
//----------|-------------|-------------- |-----------------------------------
//public -- |     Y 	  |		Y		  |		y
//          |             |               |
//private   |     Y		  |		N		  |		N
//          |             |               |
//Protected |	  Y   	  |		Y		  |		(subclass-- parent->child)
//          |             |               | 
//default   |     Y		  |		Y		  |		N
package Access_modifiers;

import java.util.Scanner;

public class Access_St {
	
	protected int id;
	public String name;
	String rollno;
	private String stdnmobno;
	
	protected void display() {
		System.out.println("id: "+id+"\n"+"Name: "+name+"\n"+"Roll No: "+rollno+"\n"+"Mobile No: "+stdnmobno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data of student 1: ");
		Access_St s1 = new Access_St();
		s1.id=sc.nextInt();
		s1.name=sc.next();
		s1.rollno=sc.next();
		s1.stdnmobno=sc.next();
		
		s1.display();
		
		System.out.println();
		
		System.out.println("Enter data of student 2: \n");
		Access_St s2 = new Access_St();
		s2.id=sc.nextInt();
		s2.name=sc.next();
		s2.rollno=sc.next();
		s2.stdnmobno=sc.next();
		
		s2.display();

	}

}

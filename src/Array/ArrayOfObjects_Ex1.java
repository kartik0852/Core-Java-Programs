package Array;

import java.util.Scanner;

class Student{
	
	public int sid;
	public String snm;
	static String clgnm = "Galgotias University";
	
	public void student(int sid, String snm) {
		Scanner sc = new Scanner(System.in);
		this.sid=sid;
		this.snm=snm;
	}
	
	public void disp() {
		System.out.println("Student Id : "+sid+" ---> Student Name : "+snm+" ---> College Name : "+clgnm);
	}

}

public class ArrayOfObjects_Ex1 {
	
	public static void main(String[] args) {
		

        // Allocating memory for 4 objects
        // of type Student
		Student[] st = new Student[4];
		
		// Creating actual student objects
		for(int i=0;i<4;i++) {
			st[i] = new Student();
		}
		// Assigning data to student objects
		st[0].student(101, "Kartik");
		st[1].student(102, "Rohit");
		st[2].student(103, "Ravi");
		st[3].student(104, "Raj");
		
		// Displaying the student data using for each loop
		for(Student data:st) {
			data.disp();
		}
		
		
		
		
		
		
		

		
	}
	

}

//Here we access class TestStudent and creating object of Test Student and it automatically access variables id , name, roll no from the class of TestStudent
//but in this class It not access of private variable it access only public, protected and default values


package Access_modifiers;

import java.util.Scanner;

public class Acces_St1_frm_St {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Access_St ts1 = new Access_St();
		
		ts1.id =sc.nextInt();
		ts1.name=sc.next();
		ts1.rollno=sc.next();
		
		ts1.display();
		
		Access_St ts2 = new Access_St();
		ts2.id =sc.nextInt();
		ts2.name=sc.next();
		ts2.rollno=sc.next();
		
		ts2.display();
	}

}

package z.mini_Project;

import java.util.Scanner;

import Custom_Exception.TestException;

public class Test_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		EmpDataImpl edi = new EmpDataImpl();
		Emp var=null;;
		
		
		
		do {
			System.out.println("CHoose 1-Add Emp Detail");
			System.out.println("CHoose 2-Display all employee details");
			System.out.println("CHoose 3-Find Emp Detail By name");
			System.out.println("Choose 4-Delete any employee detail");
			System.out.println("CHoose 5-Exit-->");
			System.out.println();
			
			System.out.print("Enter choice from 1,2,3,4,5 - ");
			choice=sc.nextInt();
			
		switch(choice) {
		
		
		case 1:	//It print the id and name of the employee by user input
			
			//Here we create an object but left hand side "Emp var" we take before the switch 
			//case so we use this in any case just write var = new "Object name();"
			
			System.out.print("Enter Employee id and name = ");
			
			var=new Emp(sc.nextInt(),sc.next());	//Here we take the data from user "Emp(int id,string nm)"
			
			System.out.println("\nId"+"\t"+"Name"+"\t\t"+"Company name");
			
			//Here they check the condition in EmpDataIml class then store the details in "res" 
			//if the condition is true then we add the data ,after the given limit it not store the data
			//Array is full so it not take any detail and it show buffer is full
			
			Emp res = null;						//we take Emp res= null;
			
			try {								//Here we use try - catch block , If user put negative id so it give an exception and Exception also created by user. 
				res = edi.addEmp(var);			//Here we store our data one by one in res		
			} 
			catch (EmpException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}		
			
			res.disp();						//Here we display over data after taking from user
			break;
			
		case 2:	//It print the all employee detai
			System.out.println("All employee details :");
			Emp[] de = null;
				de = edi.alldeatil();
			System.out.println(de);
			break;
		
			
		case 3:	//It print the one employee detail by using name of employee
			System.out.print("Find by name please type name here = ");
	
			try {
				var=edi.findbyname(sc.next());
			} catch (TestException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Id"+"\t"+"Name"+"\t\t"+"Company name");
			var.disp();
			break;
		}
		System.out.println();			//Here we use syso for sapce between two line
		
		}while(choice!=5);

	}

}

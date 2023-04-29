package z.mini_Project;

import java.lang.reflect.Array;

import Custom_Exception.TestException;

public class EmpDataImpl implements EmpData {

	Emp em[]= new Emp[4];			//Here we create an array using name of Emp because it store the array data of Emp id or Emp nm 
	static int cnt = 0;				//Here we take counter = 0 as a static  

	boolean found = false;
	@Override
	
	//Method 1 to add the employee data in array
	public Emp addEmp(Emp e) throws EmpException {          //Here we use "throws keyword to declare a Exception"
		// TODO Auto-generated method stub
		if(cnt<4) {
			if(e.id<0) {
				throw new EmpException("Warning!!!!! - Negative id not allowed please enter correct id!!!!");       //Here Exception is raised by user we create a method in EmpException class  
			}
			em[cnt] = e;				//Here we store data in array one by one unless the array limit reached after this not store any data 
			return em[cnt++];			//Here we return array with counter++ means increment of counter so first it take 0-index,then store data and 
										//then it increase +1 so the next it store the data in 1-index and it continue....
		
		}
		else {
			System.out.println("Buffer is full");      //If array limit is reached so it shows Buffer is full and return null
		}
		return null;
	}

	@Override
	
	//Method 2 to delete the employee data from an array
	public void delEmp(String nm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//Method 3 to find employee detail by his/her name
	public Emp findbyname(String nm) throws TestException {
		// TODO Auto-generated method stub
		if(!nm.equals(nm))  {
			throw new TestException("Wrong name enter...");
		}
		else {
			System.out.println(nm);
		}
		for(Emp x:em) {						//Here we use for each loop and in "em" we store the employee details and through "x" it select name from the employee detail and it display the detail
			return x;
		}
		return null;
	}

	@Override
	//Method 4 to show all employee details
	public Emp[] alldeatil() {
		// TODO Auto-generated method stub
		for(Emp d:em) {
			System.out.println(d);;
		}
		return null;
	}
	

}

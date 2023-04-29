package z.mini_Project;

import Custom_Exception.TestException;

public interface EmpData {
	public Emp addEmp(Emp e) throws EmpException;  //Return Type
	public void delEmp(String nm);
	public Emp findbyname(String nm) throws TestException;
	public Emp [] alldeatil() throws TestException;
}

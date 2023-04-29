package z.MiniProject_3;

import java.util.LinkedList;
import java.util.List;

class CusData{
	private int accountno;
	private String name;
	
	public CusData(int accountno, String name) {
		// TODO Auto-generated constructor stub
		this.accountno=accountno;
		this.name = name;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CusData [getAccountno()=" + getAccountno() + ", getName()=" + getName() + "]";
	}


	
}

public class AllCusData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<CusData> cd = new LinkedList<CusData>();
		cd.add(new CusData(1234567890, "Kartik"));

	}

}

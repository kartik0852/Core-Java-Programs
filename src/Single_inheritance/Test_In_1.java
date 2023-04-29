package Single_inheritance;

import java.util.Arrays;

public class Test_In_1 extends Test_In{

	public String ph[];
	
	public Test_In_1(String name, String pwd, String m[]) {
		super(name,pwd);
		this.ph=m;	
	}

	
	@Override
	public String toString() {
		return "Test_In_1 [ph=" + Arrays.toString(ph) + ", code=" + code + ", a=" + a + ", gvar=" + gvar
				+ ", name=" + getName() + ", Pwd=" + getPwd() + "]";
	}

	/*
	 * public void print() { System.out.println(super.code+"\t"+super.gvar); }
	 */

}

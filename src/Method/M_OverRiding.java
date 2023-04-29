//Method OverRiding

package Method;

public class M_OverRiding {

	
	int add(int a, int b) {
		return a+b;
	}

}

class Me_OverRiding_1 extends M_OverRiding{
	
	int sub(int a, int b) {
		return a-b;
	}
	
	public static void main(String args[]) {
		
		Me_OverRiding_1 mo = new Me_OverRiding_1();
		System.out.println(mo.sub(10, 7));
	}
}

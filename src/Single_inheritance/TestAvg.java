package Single_inheritance;

import java.util.Arrays;

public class TestAvg extends TestSum {
	//int b[]=new int[3];
	
	TestAvg(int bvar[]) {
		// TODO Auto-generated constructor stub
		super(bvar);
	}
	
	public void TestAvg() {
	System.out.println(super.sum(super.ar)/(float)ar.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAvg t = new TestAvg(new int[] {3,4,5,1});
		System.out.println(Arrays.toString(t.ar));
		t.TestAvg();
		
		

	}

}

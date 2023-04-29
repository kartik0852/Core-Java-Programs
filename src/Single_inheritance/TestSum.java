package Single_inheritance;

public class TestSum {
	
	int ar[] = new int[3]; // DM

	public TestSum() { //default const
		// TODO Auto-generated constructor stub
	}
	public TestSum(int n[]) { //parameterized 
		// TODO Auto-generated constructor stub
		this.ar=n;
	}
	
	int sum(int y[]){
		int sum=0;
		for(int var:y) {
			sum += var;
		}
		return sum;
	}
	
}

package Basic_Programs;

//Fibonacci Series program using recursion.
public class Fibonacci_Ex3 {
	
	static int n1=0,n2=1,n3=0;
	
	static void fibonacci(int count) {
		if(count > 0) {
			n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacci(count-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=10;
		System.out.print(n1+" "+n2);
		fibonacci(count);
	}

}

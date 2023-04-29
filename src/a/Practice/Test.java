package a.Practice;

//Concatenation before string/ After String
//Explicit Typecast
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		n1 = 10;
		n2 = 20;
		n3 = n1+n2;
		System.out.println("Result = "+n3);
		System.out.println(10 + 20+" Kartik"); //In this they do sum and add string = 30 Kartik
		System.out.println(10+25+" Kartik "+10+29); //In this they do sum and add string and again we do sum but they not add 2 var bcz after appllying string they do not give summation, so that's why it add up with string = 35 Kartik 1029
		System.out.println(10+15+" Kartik " +10 + ( 10+15)); //In this they do sum and add string and if we use brackets so it add 2 var and after this add with string = 25 Kartik 1025
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of a = ");
		a = sc.nextInt();
		System.out.print("Enter value of b = ");
		b = sc.nextInt();
		
		long c = a + b;
		
		System.out.println("Sum is = "+c);
		
		int var = (int)c; //Explicit type casting 
		System.out.println("Sum of two variable = "+ var);
		
		
		
		
	}

}

package a.Practice;

//Summation of two integer
import java.util.Scanner;

public class TestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		a=9;
		b=8;
		c=a+b;
		System.out.println("here sum is:"+c);
		System.out.println(10+20+"java");
		System.out.println(10+20+"java"+(1+26-7)); //expression is higher priority here
		
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter value for num1 and num2");
		num1=sc.nextInt();
		num2=sc.nextInt();
		long sum = num1+num2;
		System.out.println("sum of user inputed value:"+sum);
		
		int var=(int)sum;//explicit ype casting
		System.out.println(var);
		
		
		
	}

}

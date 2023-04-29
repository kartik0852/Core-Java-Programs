package Aggregation;

class Operation{
	
	//Creating method
	int square(int n) {
		return n*n;
	}
}

class Circle{
	Operation op;	//Aggregation 
	double pi = 3.14;
	
	//Creating method
	double area(int radius) {
		op = new Operation();
		
		//Here we reuse of method square and pass the radius in the argument
		//So it use square method and multiply radius * radius 
		//Bcz area of circle is pi*r*r;
		int rsquare = op.square(radius);	
			
		return pi*rsquare;
	}
}

public class Aggregation_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		double res = c.area(5); 	//Here we give the radius
		System.out.println("Area of Circle : "+res);
	}

}

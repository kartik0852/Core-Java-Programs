package Abstraction_interface_Ex_2;

//Using interface: by third user  


//Run Time Polymorphism
public class TestBank {

	static Bank b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new SBI();
		System.out.println("SBI Bank Rate of Interest = "+b.rateOfinterest());
		
		b = new AXIS();
		System.out.println("Axis Bank Rate of Intrest = "+b.rateOfinterest());

	}

}

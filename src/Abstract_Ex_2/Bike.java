package Abstract_Ex_2;

abstract class Bike {
	Bike(){
		System.out.println("Bike is Created!!");
	}
	
	//Abstract method is created
	abstract void run();
	
	//Non-Abstract method is created
	void bike() {
		System.out.println("Bullet is created");
	}

}

package Multithreading;



public class Multhreading_Odd_Even  {
	
	void even(int n) {
		for(int i = 0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
	}
	 
	synchronized void odd(int n) {
		for(int i = 0;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multhreading_Odd_Even mt = new Multhreading_Odd_Even();
		
		//System.out.println("Even no are : ");
		Thread1 t1 = new Thread1(mt, "Threadone");
		t1.start();
		
		System.out.println();
		Thread2 t2 = new Thread2(mt, "Threadtwo");
		t2.start();
	}

}

class Thread1 extends Thread{
	Multhreading_Odd_Even m;
	public Thread1(Multhreading_Odd_Even m, String nm) {
		// TODO Auto-generated constructor stub
		this.m=m;
		this.setName(nm);
	}
	
	public void run() {
		m.even(10);
	}
}

class Thread2 extends Thread{
	Multhreading_Odd_Even m;
	public Thread2(Multhreading_Odd_Even m, String nm) {
		// TODO Auto-generated constructor stub
		this.m=m;
		this.setName(nm);
	}
	
	public void run() {
		m.odd(10);
	}
}
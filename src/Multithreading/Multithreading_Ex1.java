package Multithreading;

class Table {
	
	
	   void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			
			
			System.out.println(n * i+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
	}
	  synchronized void show()  {
		  for (int i = 9; i >=6; i--) {
			  System.out.println("synchno..vai"+Thread.currentThread());
		try {
			Thread.sleep(600);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
		  }
}
class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t,String nm) {
	
		this.t = t;
		this.setName(nm);
		this.setPriority(8);// high priority
	}
	public void run() {
		t.printTable(100);
		//t.show();
	}
}
class MyThread1 extends Thread {
	Table t;
	
	public MyThread1(String nm,Table tvar) 
		// TODO Auto-generated constructor stub
	{
		this.t = tvar;
		this.setName(nm);
		this.setPriority(1);
	}
	public void run() {
		t.printTable(5);
		//t.show();
	}
}

public class Multithreading_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();// only one object
		MyThread2 t2 = new MyThread2(obj,"secondthread");
		MyThread1 t1 = new MyThread1("firstthread",obj);
		
				
		t2.start();
		t1.start();
		
		
		//t2.start();

	}

}

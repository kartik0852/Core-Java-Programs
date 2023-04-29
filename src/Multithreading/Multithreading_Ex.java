package Multithreading;

//Multithreading

import java.util.Scanner;

public class Multithreading_Ex extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("Enter value of x : ");
		x = sc.nextInt();
		int y;
		System.out.print("Enter value of y : ");
		y = sc.nextInt();
		int c=x+y;
		
		//Use "currentThread().getname()" it print the name, which thread run first and which thread run at last it all depends on JVM
		System.out.println("Summation of x and y : "+c+" -----> "+currentThread().getName());	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object of class
		Multithreading_Ex mt = new Multithreading_Ex();
		
		//Creating object of Thread t1 and pass the argument of class object reference name  
		Thread t1 = new Thread(mt);
		
		//It print "main" because main is also a thread and in the main we exectes our threads
		System.out.println(currentThread().getName());
		
		//Here we use start() method to start the threading of run() method
		t1.start();
		
		
		//Using try and catch block bcz if we use join, sleep or any other methods so it shows an error 
		try {
			//Using join() method, So it execute the t1 thread first and start threading of another thread t2 
			t1.join();
			
			//USing sleep() method so we pass the time in "mili seconds"and it hold for few second and then execute another thread t2 
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Creating another object of Thread t2 and pass the argument of class object reference name
		Thread t2 = new Thread(mt);
		System.out.println(currentThread().getName());
		
		//Here we use start() method to start the threading of run() method
		t2.start();
		

	}

}

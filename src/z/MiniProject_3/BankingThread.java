package z.MiniProject_3;

import java.util.Scanner;

//Creating class of Customer
class Customer{
	public float amount;
	public String cusname;

	Scanner sc = new Scanner(System.in);
	
//Creating method to withrawl cash
	synchronized void withdrawl(float amount,String cusname) {
		System.out.println("Going to withrawl......");
		/*
		 * this.amount = amount; this.cusname = cusname;
		 */
		if(this.amount < amount) {
			System.out.println("Insuficient balance waiting for deposit first.....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount -= amount;
			System.out.println(cusname+ " Withrawl ₹-"+amount+"cr from account Successfuly....");
			System.out.println("Balance left in account ₹-"+this.amount);
		}
	}
	
	//Creating method to Deposit cash
	synchronized void deposit(float amount,String cusname) {
		this.amount = amount;
		this.cusname = cusname;
		this.amount += amount;
		System.out.println(cusname+" Deposit ₹-"+this.amount+"cr in account successfully....");
		notify();
	}

}


//Main class..............
public class BankingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final Customer c = new Customer();
		AllCusData acd = new AllCusData();
		
		Thread11 t1 = new Thread11(acd,c);
		t1.start();
		Thread12 t2 = new Thread12(acd,c);
		t2.start();
	}

}


class Thread11 extends Thread{
	AllCusData acd;
	Customer c;
	Scanner sc = new Scanner(System.in);
	public Thread11(AllCusData acd,Customer c) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.acd = acd;
	}
	public void run() {
		//System.out.println("Enter amount and customer name for withdraw ");
		c.withdrawl(15000,"Rohit");
	}
}

class Thread12 extends Thread{
	AllCusData acd;
	Customer c;
	Scanner sc = new Scanner(System.in);
	public Thread12(AllCusData acd,Customer c) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.acd = acd;
	}
	public void run() {
		System.out.println();
		System.out.println("Enter amount and customer name for deposit : ");
		c.deposit(sc.nextFloat(),sc.next());
		
	}
}
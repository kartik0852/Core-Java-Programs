package Multithreading;

public class FramePattern {
	
	void printTop(int x,int y) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				if(i==1) 
					System.out.print("/");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	void printBottom(int x,int y) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				if(i==x) 
					System.out.print("/");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	void printLeft(int x,int y) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				if(j==1) 
					System.out.print("/");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
	void printRight(int x,int y) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				if(j==y) 
					System.out.println("/");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FramePattern ssp = new FramePattern();
		
		Threads1 t1 = new Threads1(ssp);
		t1.start();
		
		Threads2 t2 = new Threads2(ssp);
		t2.start();
		
		Threads3 t3 = new Threads3(ssp);
		t3.start();
		
		Threads4 t4 = new Threads4(ssp);
		t4.start();


	}

}

class Threads1 extends Thread{
	FramePattern s;
	public Threads1(FramePattern s) {
		this.s=s;
	}
	
	public void run() {
		s.printTop(7, 22);
		
		
	}
	
}
class Threads2 extends Thread{
	FramePattern s;
	public Threads2(FramePattern s) {
		this.s=s;
	}
	
	public void run() {
		
		s.printLeft(7, 22);
		
		
	}
	
}
class Threads3 extends Thread{
	FramePattern s;
	public Threads3(FramePattern s) {
		this.s=s;
	}
	
	public void run() {

		s.printRight(7, 22);

		
		
	}
	
}
class Threads4 extends Thread{
	FramePattern s;
	public Threads4(FramePattern s) {
		this.s=s;
	}
	
	public void run() {

		s.printBottom(7, 22);
		
		
	}
	
}
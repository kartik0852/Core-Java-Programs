package Pattern;

public class SquareStarPattern {
	
	synchronized void printFrame(int x,int y) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				if(i==1) {
					System.out.print("/");
				}
				else if(i==x) {
					System.out.print("/");
				}
				else if(j==1) {
					System.out.print("/");
				}
				else if(j==y) {
					System.out.print("/");
				}
				else
					System.out.print(" ");{
					}	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquareStarPattern ssp = new SquareStarPattern();
		
		Thread1 t1 = new Thread1(ssp);
		t1.start();


	}

}

class Thread1 extends Thread{
	SquareStarPattern s;
	public Thread1(SquareStarPattern s) {
		this.s=s;
	}
	
	public void run() {
		s.printFrame(10, 22);
	}
	
}

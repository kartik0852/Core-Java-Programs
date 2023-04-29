package Exception_Handling;

import java.io.IOException;

public class Throws_Key {
	void add() throws IOException {
		throw new ArithmeticException("no");
	}
	
	void sub() throws IOException {
		add();
	}
	
	void disp() {
			try {
				add();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package Custom_Exception_2;

import java.util.Scanner;

class Book{
	public int bid;
	public String bnm;
	public Book(int bid, String bnm) {
		// TODO Auto-generated constructor stub
		this.bid=bid;
		this.bnm=bnm;
	}

void disp() {
	System.out.println("Id : "+bid+" Name : "+bnm);
}
}

class BookException extends Throwable{
	public BookException(String s) {
		super(s);
	}
}
public class TestBook {
	public static void main(String[] args) throws BookException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book id and book name: ");
		Book b = new Book(sc.nextInt(),sc.next());
		while(b.bid==200) {
			System.out.println("Enter bookid and booknm again: ");
			break;
		}
		if(b.bnm.contains("exit")){
			throw new BookException("Please enter other name except exit!!!!!!");
		}
		else
			b.disp();

	}

}

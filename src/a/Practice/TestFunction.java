package a.Practice;

class Book{
	int bid=90;
	String bname;
	
	public void disp() {
		System.out.println(bid);
	}
}



public class TestFunction {

	public static void main(String[] args) {
		
		Book book = new Book();
		System.out.println(book.bid+"------"+book.bname);
		book.disp();
		book.bid=100;
		System.out.println(book.bid+"------"+book.bname);
	}
}

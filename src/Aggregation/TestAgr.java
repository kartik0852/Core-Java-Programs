package Aggregation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


class Book{
	String bookname;
	String athrnm;
	
	public Book(String bookname,String athrnm) {
		this.bookname=bookname;
		this.athrnm=athrnm;
		
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", athrnm=" + athrnm + "]";
	}
	
}
class Library{
	String libname;
	List<Book> Books;
	
	public Library(String libname,List<Book> Books) {
		this.libname=libname;
		this.Books=Books;
	}

	public String getLibname() {
		return libname;
	}

	public void setLibname(String libname) {
		this.libname = libname;
	}

	@Override
	public String toString() {
		return "Library [libname=" + libname + ", Books=" + Books + "]";
	}


}

public class TestAgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book("Java", "James Gosling");
		Book bk1 = new Book("SQL","Alan");
		
		List<Book> bl = new ArrayList<Book>();
		bl.add(bk);
		bl.add(bk1);
		
		Library l = new Library("Galgotias Univerity", bl);
		Map<Integer, Library> m= new HashMap<Integer,Library>();
		m.put(1, l);
		System.out.println(m);
		Set s= m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(l);

	}

}

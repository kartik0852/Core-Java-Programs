package Collection;

//HashSet Example Book
import java.util.HashSet;

//Created a class of Book
class Book{
	int id,quantity;	//Creating instance variable 
	String name,author,publisher;	//Creating instance variable 
	
	Book(int id,String name, String author,String publisher,int quantity){		//Creating a constructor
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}

	void disp() {	//Creating a method
		System.out.println(this.id+" "+this.name+" "+this.author+" "+this.publisher+" "+this.quantity);
	}
}

public class HashSet_Ex_Book{	//Creating a another class where we store the data which we take in another class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
		HashSet<Book> h = new HashSet<Book>();		//Creating a Hash Set
		
		//Creating Book
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);   
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    
	    //Add the all book(Objects) data in Hash Set
	    h.add(b1);
	    h.add(b2);
	    h.add(b3);
	    
	    //And Store the all data in object "b"
	    for (Book b : h) {
	    	b.disp();		//Display the all data we add in Hash Set
			
		}
	}
	
}

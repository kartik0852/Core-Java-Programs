package Home_Practice;

public class Book {
	public int id;
	public String nm;
	
	public Book(int id, String nm) {
		this.id=id;
		this.nm=nm;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", nm=" + nm + "]";
	}
	
	void disp() {
		System.out.println(this.id+"\t"+this.nm);
	}

}

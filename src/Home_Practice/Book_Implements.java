package Home_Practice;

public class Book_Implements implements Book_Methods {
	
	Book ar[] = new Book[3];
	int cnt = 0;

	@Override
	public Book addBookname(Book b) {
		// TODO Auto-generated method stub
		if(cnt<3) {
			ar[cnt]=b;
			return ar[cnt++];
		}
		return null;
	}

}

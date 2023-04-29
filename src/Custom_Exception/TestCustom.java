package Custom_Exception;

import java.util.Scanner;

class User{
	public int id;
	private String nm;
	User(int id, String n){
		this.id=id;
		this.nm=n;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nm=" + nm + "]";
	}
	
}
interface ui{
	public User addUser(User u) throws UserException;
}
class uiimpl implements ui{
	User []url= new User[3];
	static int cnt=0;
	@Override
	public User addUser(User u) throws UserException {
		// TODO Auto-generated method stub
		//["a","b"]  exception 
				if (cnt<3) {
						if (u.id<0) {
								throw new UserException("id negative not allowed");
						}
					url[cnt]=u;
					return url[cnt++];
				}
				else {System.out.println("buffer is full");
					return null;
				}
				
	}
	
}
class UserException extends Exception{
	UserException(String s){super(s);}
	
}
public class TestCustom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 uiimpl ud = new uiimpl();
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do {
		
			System.out.println("plz enter choice:");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:System.out.println("plz enter id and name");
			User uinsertobj= new User(sc.nextInt(),sc.next());
			User tmpuser=null;
			try {
				tmpuser = ud.addUser(uinsertobj);
			} catch (UserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("-----"+tmpuser);
				break;

			default:
				break;
			}
		
		
		}while(ch!=0);
		
		
			
		

	}

}

package Array;

import java.util.Arrays;

class Games{
	public int gameid;
	public String gamenm;
	
	public Games(int gameid, String gamenm) {
		// TODO Auto-generated constructor stub
		this.gameid = gameid;
		this.gamenm = gamenm;
	}

	@Override
	public String toString() {
		return "Games [gameid=" + gameid + ", gamenm=" + gamenm + "]";
	}

	
	public void disp() {
		System.out.println("Game Id : "+gameid+" ---> Game Name : "+gamenm);
	}
}

public class ArrayOfObjects_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Games[] gms = new Games[4];		//Creating array of object
		gms[3] = new Games(1, "Tomb Raider"); 	//Store 1st game at index at 3
		
		gms[2] = new Games(2, "Need For Speed");	//Store 2nd game at index 2
		
		gms[1] = new Games(3, "Call Of Duty");		//Store 3rd game at index 1
		
		gms[0] = new Games(4, "GTA 5");			//Store 4th game at index 0
		
		System.out.println(gms[0]);	 	//Display the game which placed at index 0
		
		//Using for each loop to display all games display which is store in array
		for(Games allgms:gms) {
			allgms.disp();
		}
		
		
		

	}

}

package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindMax{
	//find 2max without sorting an elemnt.
	static int ar[] = {9,8,6,0,12};
	static int m=ar[0];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for (int i = 0; i < ar.length; i++) {
			if (m<ar[i]) {
				m=ar[i];
				ar[i]=Integer.MIN_VALUE;
				System.out.println(ar[i]);
				
			}
			
		}
		        
}
}

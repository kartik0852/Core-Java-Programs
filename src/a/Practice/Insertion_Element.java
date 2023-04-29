package a.Practice;

// Insert the element at any index and shift that index to the next index 
// [1,2,3,4,5] --> Original array
// Insert -9 at index 2
// [1.2.9.3.4.5] --> After insert new element
import java.util.Arrays;

public class Insertion_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		
		a[0]=2;
		a[1]=3;
		a[2]=4;
		System.out.println(Arrays.toString(a));
		int pos=-1;
		int key=2;
		for(int i = 0;i<a.length;i++) 
		{
				if(a[i]==a[i]) 
				{
					pos=i;
					break;
				}
		}
		System.out.println(pos);
		for(int i=pos;i<a.length-1;i++){
			a[i+1]=a[i];
			a[pos]=9;
		}
		System.out.println(Arrays.toString(a));
		

	}

}

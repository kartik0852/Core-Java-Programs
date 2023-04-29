package a.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class asdf {
	
	int id;
	String nm;
	int cnt =0;
	asdf ar[]=new asdf[3];
	public asdf(int id, String nm) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.nm=nm;
	}
	
	@Override
	public String toString() {
		return "asdf [id=" + id + ", nm=" + nm + ", cnt=" + cnt + ", ar=" + Arrays.toString(ar) + "]";
	}

	asdf addData(asdf a){
		if(cnt<3) {
			ar[cnt]=a;
			return ar[cnt++];
		}
		return null;
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		asdf f = new asdf(sc.nextInt(),sc.next());
		System.out.println(f);
		
		
	}
	

}

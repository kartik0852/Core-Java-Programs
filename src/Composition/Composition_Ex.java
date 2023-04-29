package Composition;

import java.util.ArrayList;
import java.util.List;

class College{
	public String clgnm;
	public String clgadres;
	
	public College(String clgnm, String clgadres){
		this.clgnm= clgnm;
		this.clgadres=clgadres;
	}
}

//University has more than one colleges
class University{
	
	List<College> clg;
	
	public University(List<College> clg) {
		// TODO Auto-generated constructor stub
		this.clg = clg;
	}
	
	//Getting total no of colleges
	List<College> gtcUniversity(){
		return clg;
	}
}

public class Composition_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the objects of colleges class
		College clg1 = new College("Galgotias College", "Greater Noida");
		College clg2 = new College("AKG college", "Ghaziabad");
		
		//Creating list which contains the no of colleges
		List<College> clge = new ArrayList<College>();
		clge.add(clg1);
		clge.add(clg2);
		
		University u = new University(clge);
		List<College> clges = u.gtcUniversity();
		for(College cg:clges) {
			System.out.println("Name : "+cg.clgnm+" and Address : "+cg.clgadres);
		}
	}

}

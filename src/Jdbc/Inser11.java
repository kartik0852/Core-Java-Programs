package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Inser11 {
	int id;
	String name;
	String authornm;
	
	public Inser11(int id, String name, String authornm) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.authornm=authornm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		Connection con =null;
	
		Inser11 i = new Inser11(106, "C","asfljhas");
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bk", "root", "root");
			
			Statement stmt = con.createStatement();
			System.out.println("---------");
			String q = "insert into book value('"+i.id+"','"+i.name+"','"+i.authornm+"')";
			int i1 = stmt.executeUpdate(q);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

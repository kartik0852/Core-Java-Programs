package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Del_1_Query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bk", "root", "root");
			
			//Parametric query---->PreparedStatement
			System.out.println("Delete entire row just type book name: ");
			String s = "delete from book where bnm=?";
			PreparedStatement pst=con.prepareStatement(s);
			pst.setString(1, sc.next());
			
			int i = pst.executeUpdate();
			System.out.println(i);
			pst.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

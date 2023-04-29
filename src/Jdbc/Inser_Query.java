package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Inser_Query {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bk", "root", "root");
			

			java.sql.Statement stmt = con.createStatement();
				System.out.println("Enter bookid ,book name, book author name: ");
				String q = "insert into book values('"+sc.nextInt()+"','"+sc.next()+"','"+sc.next()+"')";
				int i = stmt.executeUpdate(q);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

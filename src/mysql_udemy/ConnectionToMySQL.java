package mysql_udemy;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToMySQL {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			String password="";
			
			Connection myConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/join_us_db","root", password);
			System.out.println("db connection established");
			myConnection.close();
			System.out.println("db connection closed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

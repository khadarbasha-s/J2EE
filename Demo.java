package com.kb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo {
	public static void main(String args[]) throws Exception {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loded the driver class");
		String query = "INSERT INTO student VALUES (1, 'khadar', 22)";
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db?user=root & password=12345");
		System.out.println("connection is successfully completed");
		Statement st=c.createStatement();
		
		System.out.println("platform is created successfully");
		st.executeUpdate(query);
		System.out.println("Data inserted sucessfully");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

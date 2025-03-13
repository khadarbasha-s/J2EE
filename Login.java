package login.web;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Login {
	public static void main(String args[])throws Exception {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/input";
		String user="root";
		String pass="12345";
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		String insert="insert into details values(?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class loaded sucessfully");
		con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connection Established Sucessfully..");
		ps=con.prepareStatement(insert);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		ps.setString(1, name);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		ps.setInt(2, age);
		System.out.println("Enter your Email:");
		String email=sc.next();
		ps.setString(3, email);
		System.out.println("Enter the password:");
		String pas=sc.next();
		ps.setString(4, pas);
		System.out.println("Verify the password");
		String vpas=sc.next();
		ps.setString(5, vpas);

		if(pas.equalsIgnoreCase(vpas)) {
			System.out.println("SignUp completed successfully....");
			ps.execute();
			System.out.println("Data has been updated successfully");
		}
		else {
			System.out.println("Details miss match...");
			
		}
		ps.close();
		System.out.println("prepareStatement is closed");
		con.close();		
		System.out.println("Connection was closed");
	}

}

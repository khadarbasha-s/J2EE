package personal_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Student_info {

	public static void main(String[] args)throws Exception {
		Connection con=null;
		ResultSet rs=null;
		String getData="SELECT * FROM USER";
		String url="jdbc:mysql://localhost:3306/studentapp";
		String user="root";
		String pass="12345";
		PreparedStatement ps=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class loaded Sucessfully..");
		con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connection Established Successfully");
		String query="insert into user values('Bavabi',22,'CSE')";
		Statement st= con.createStatement();		
		st.executeUpdate(query);


		ps=con.prepareStatement(getData);
		rs=ps.executeQuery();
		while(rs.next()) {
			String name=rs.getString(1);
			int no=rs.getInt(2);
			String course=rs.getString(3);
			System.out.println("name of the Student: "+name+"Roll No: "+no+"Branch of Student: "+course);
			
		}
		System.out.println("THank for You");
		
		
		
		
		// TODO Auto-generated method stub

	}

}

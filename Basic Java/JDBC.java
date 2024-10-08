package Assignment;
import java.sql.*;
public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
String url ="jdbc:mysql://localhost:3306/my_database";
String username="root";
String password="Root";
String query ="Select*from employees";
try {
	Class.forname(className:"com.mysql.jdbc.Driver");
	System.out.println("Drivers loaded successfully!!!");
}catch (ClassNotFoundException e) {
	System.out.println(e.getMessage());
}
try {
	Connection con=DriverManager.getConnection(url,username,password);
	System.out.println("Connection Established Successfully!!!");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery(Query);
	while(rs.next()) {
		int id=rs.getInt(columnLabel "id");
		String name=rs.getString(columnLabel="name");
		String jon_title=rs.getString(columnLabel="job_title");
		double salary=rs.getDouble(columnLabel="salary");
		System.out.println();
		System.out.println("**********************");
		System.out.println("ID: "+id);
		System.out.println("Name:"+name);
		System.out.println("Job_title:"+job_title);
		System.out.println("Salary:"+salary);
	}
}catch(SQLException e)
{System.out.println(e.getMessage());	}

}
}


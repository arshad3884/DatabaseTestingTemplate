import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;


public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		//Creating DB connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host + ":"+ port + "/qadbt", "root", "1122");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM employeeinfo where name ='arshad'");
		//here rs is the array which store the fetched data from db and 
		//we can iterate through using index value or using .next
		rs.next();
		String location = rs.getString("location");
		String age = rs.getString("age"); 
		System.out.println(location);
		System.out.println(age);
		//After getting data from our db we can use it anywhere in our code
	}

}

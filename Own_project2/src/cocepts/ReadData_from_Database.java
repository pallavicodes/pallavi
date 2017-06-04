package cocepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData_from_Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","HR","");
	Statement stm=con.createStatement();
	String sql="select STD_NAME from table where STD_ID=1 ";
	ResultSet rs=stm.executeQuery(sql);
	System.out.println(rs.getString("STD_NAME"));
	}	}
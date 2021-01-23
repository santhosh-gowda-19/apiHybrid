package qspiders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JdbctoJson 
{
	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","hlsk1234$");
		System.out.println("connected to mysql db");
		Statement smt = con.createStatement();
		ResultSet res = smt.executeQuery("select * from CustomerInfo where Location='Asia' LIMIT 1");
		while(res.next())
		{
			System.out.println(res.getString(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println(res.getString(4));
	
		}
	}

}

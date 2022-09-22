package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class convector{  
	void exe() {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_data","root","admin123");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from library_tbl");  
			while(rs.next())  
			 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			con.close();  
			}catch(Exception e){ System.out.println(e);
			}    
	}
}
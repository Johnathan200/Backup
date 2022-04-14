package com.connection;

import java.sql.*;  
public class convector{  
public void Jsql() {  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","admin123");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from login_tbl");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
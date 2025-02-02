package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginDao {

	String sql="select * from login where uname=? ans pass=?";
	private final String url="jdbc:mysql://localhost:3306/mydatabase";
	private final String username="root";
	private final String password="Admin@123";
	
	
	public boolean check(String uname, String pass) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			PreparedStatement pstm=connection.prepareStatement(sql);
			pstm.setString(1, uname);
			pstm.setString(2, pass);
			ResultSet rs=pstm.executeQuery();
			
			while (rs.next()) {
				return true;
				
			}
			
		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
}

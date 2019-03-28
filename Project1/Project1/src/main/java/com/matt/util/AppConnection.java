package com.matt.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AppConnection 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://mysqldb.cplfg9bvmrxi.us-east-2.rds.amazonaws.com:3306/?useSSL=false";
        String username = "mySQLLeClair";
        String password= "sqlleclair";
        
        Connection conn = null;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(url,username,password);
	            System.out.println("Connected!");
					Statement statement = conn.createStatement();
					
					String sql = "select * from users";
					//String insert = "insert into TABLE (TABLE COLUMNS)" + " values(?, ?, ?, ?, ?)";
					
					//PreparedStatement prepared = connection.prepareStatement(insert);
					/*prepared.setInt(1,  13);
					prepared.setString(2, "Frank Sinatra");
					prepared.setInt(3, 65);
					//prepared.setDate(4,"1975-03-09", simpleDate);
					prepared.setInt(5,  1);
					prepared.execute();*/
					
					ResultSet artists = statement.executeQuery(sql);
					
					while(artists.next())
						System.out.println(artists.getString("artistName"));
					artists.close();
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
}

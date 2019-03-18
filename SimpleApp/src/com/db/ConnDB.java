package com.db;
import java.sql.*;
import java.util.Properties;
import java.io.*;

public class ConnDB {
	static private Connection cnn;
	public static Connection connectionToDB(){
				try {
					FileInputStream fis = new FileInputStream("D:\\db.properties");
					Properties pro = new Properties();
							pro.load(fis);
					Class.forName("com.mysql.jdbc.Driver");
					cnn = DriverManager.getConnection(pro.getProperty("dbUrl"), pro.getProperty("dbUser"), pro.getProperty("dbPass"));
					System.out.println(cnn);
					System.out.println("Connection Success...");
				} 
				catch (SQLException sqle) {
					System.out.println(sqle);
				}
				catch (IOException ioe) {
					System.out.println(ioe);
				}
				catch (Exception e) {
					System.out.println(e);
				}
				return cnn;
	}
}

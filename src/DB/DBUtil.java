package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/formula";
	private static final String user = "root";
	private static final String password = "password";
	
	private static Connection conn =null;
	
	static{
				
					try {
						//1. drive 
						Class.forName("com.mysql.jdbc.Driver");
						//2. get the connect with database
						conn =  DriverManager.getConnection(url, user, password);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			
	}
	
	public static Connection getConnection(){
		return conn;
	}
	
}

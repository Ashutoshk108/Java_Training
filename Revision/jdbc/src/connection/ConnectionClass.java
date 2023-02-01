package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	static Connection con;
	
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String password="Bhavna123";
			String url="jdbc:mysql://localhost:3306/samplejdbc?autoReconnect=true&useSSL=false";
			
			con=DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}

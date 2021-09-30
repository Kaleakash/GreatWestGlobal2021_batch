package resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static Connection con;
	public static Connection getDbConnection() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
		}catch (Exception e) {
			System.out.println("Db Exception "+e);
		}
		return con;
	}
	public static void closeDb() {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Close the connection "+e);
		}
	}
}

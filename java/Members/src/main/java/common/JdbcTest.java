package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	
	private static String driverClass = "oracle.jdbc.OracleDriver";	
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "c##mydb";
	private static String password = "mydb";
	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("연결 성공" + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

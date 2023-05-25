package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	// 필드
	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "c##mydb";
	private static String password = "mydb";

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			System.out.println("오라클 로딩");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection 객체 생성"+conn);
			System.out.println("연결성공");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("연결실패");
		}
		
	}

}

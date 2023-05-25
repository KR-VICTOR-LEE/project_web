package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO - 데이터베이스 연결 및 연동(입력, 검색, 수정, 삭제) 기능 클래스
public class PersonDAO {
	// 필드
	private Connection conn = null; // 연결 처리 클래스
	private PreparedStatement pstmt = null; // sql 처리 클래스
	// 연결 - 클래스 작성 호출
	
	// 자료 삽입
	public void insertPerson(Person Person) {
		conn = JDBCUtil.getConnection();
		String sql = "insert into person(userid, userpw, name, age)\r\n"
				+ "values(?, ?, ?, ?);";
	}
	// 자료 검색
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "select * from person";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Person person = new Person(); // 기본 생성자 
				// person테이블에서 userid를 가져와서 person 객체에 저장
				person.setUserId(rs.getString("userid")); 
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person); //사람 객체를 리스트에 저장 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personList; // 호출하는 장소로 반환(돌려줌)
		
	}
}

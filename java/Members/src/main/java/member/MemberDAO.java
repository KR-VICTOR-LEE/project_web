package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCUtill;

public class MemberDAO {
	// 생성
	private Connection conn = null; // 연결객체
	private PreparedStatement pstmt = null; // SQL 처리
	private ResultSet rs = null; // 검색 및 자료처리

	// 회원 목록
	public ArrayList<Member> getMemberList() {
		ArrayList<Member> memberList = new ArrayList<>();
		conn = JDBCUtill.getConnection();
		String sql = "SELECT * FROM t_member ORDER BY joindate DESC";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member();
				member.setMemberId(rs.getString("memberid"));
				member.setPasswd(rs.getString("asswd"));
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setJoinDate(rs.getDate("joinDate"));

				memberList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtill.close(conn, pstmt, rs);
		}

		return memberList;

	}
}

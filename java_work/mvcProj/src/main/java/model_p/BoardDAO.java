package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;

	public BoardDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:/comp/env/mvc322");
			con = ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<BoardDTO> list() {

		sql = "select * from board";
		ArrayList<BoardDTO> res = new ArrayList<>();

		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();

			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setSeq(rs.getInt("seq"));
				dto.setLev(rs.getInt("lev"));
				dto.setPname(rs.getString("pname"));
				dto.setPw(rs.getString("pw"));
				dto.setTitle(rs.getString("title"));
				dto.setUpfile(rs.getString("upfile"));
				dto.setContent(rs.getString("content"));
				dto.setReg_date(rs.getTimestamp("reg_date"));

				res.add(dto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public BoardDTO detail(int id) {

		sql = "select * from board where id = ?";
		BoardDTO dto = null;

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			rs = ptmt.executeQuery();

			if (rs.next()) {
				dto = new BoardDTO();
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setSeq(rs.getInt("seq"));
				dto.setLev(rs.getInt("lev"));
				dto.setPname(rs.getString("pname"));
				dto.setPw(rs.getString("pw"));
				dto.setTitle(rs.getString("title"));
				dto.setUpfile(rs.getString("upfile"));
				dto.setContent(rs.getString("content"));
				dto.setReg_date(rs.getTimestamp("reg_date"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return dto;
	}
	
	public void addBoard(BoardDTO boardDTO) {

		sql = "insert into board(id, title, pname, pw, content, reg_date, cnt, seq, lev, gid)\r\n"
				+ "values(?,?,?,?,?,?,?,?,?,?)";
		

		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, boardDTO.getId());
			ptmt.setString(2, boardDTO.getTitle());
			ptmt.setString(3, boardDTO.getPname());
			ptmt.setString(4, boardDTO.getPw());
			ptmt.setString(5, boardDTO.getContent());
			ptmt.setString(6, boardDTO.getReg_dateStr());
			ptmt.setInt(7, boardDTO.getCnt());
			ptmt.setInt(8, boardDTO.getSeq());
			ptmt.setInt(9, boardDTO.getLev());
			ptmt.setInt(10, boardDTO.getGid());
			ptmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		
	}

	public void close() {
		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		if (ptmt != null)
			try {
				ptmt.close();
			} catch (Exception e) {
			}
		if (con != null)
			try {
				con.close();
			} catch (Exception e) {
			}
	}
}

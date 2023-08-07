package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class GalleryDAO {
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;

	String sql;

	public GalleryDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:/comp/env/mvc322");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<GalleryDTO> list() {
		sql = "select * from gallery";
		ArrayList<GalleryDTO> res = new ArrayList<>();
		
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while (rs.next()) {
				GalleryDTO dto = new GalleryDTO();
				dto.setFid(rs.getInt("fid"));
				dto.setTitle(rs.getString("title"));
				dto.setFupfile(rs.getNString("fupfile"));
				dto.setFcontent(rs.getNString("fcontent"));
				dto.setCnt(rs.getInt("cnt"));
			
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

public int totalCnt(){
		
		sql = "select count(*) from gallery";
		int res = 0;
		try {

			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next(); 
			res = rs.getInt(1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}
	
	
	public GalleryDTO detail(int fid){
		
		sql = "select * from gallery where fid = ?";
		GalleryDTO dto = null;
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, fid);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				dto = new GalleryDTO();
				dto.setFid(rs.getInt("fid"));
				dto.setTitle(rs.getString("title"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setFupfile(rs.getString("fupfile"));
				dto.setFcontent(rs.getString("fcontent"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	
	public void addCount(int id){
		
		sql = "update gallery set cnt = cnt + 1 where fid = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			ptmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public void write(GalleryDTO dto){
		
		
		
		try {
			sql = "select max(fid)+1 from gallery";
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next();
			dto.setFid(rs.getInt(1));
			
			
			ptmt.close();
			
			/*
			 * sql = "insert into board " +
			 * "(id, title, pname, pw, upfile, content, seq, lev, gid, cnt, reg_date) "+
			 * "values (?, ?, ?, ?, ?, ?, 0, 0, ? ,-1, sysdate() )";
			 */
		
			
							
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public int delete(GalleryDTO dto){
		
		sql = "delete from board where id = ? and pw = ?";
		int res = 0;
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getFid());
			ptmt.setString(2, dto.getFpw());
			
			res = ptmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	
	public void fileDelete(GalleryDTO dto){
		
		sql = "update gallery set fupfile = null where fid = ? and fpw = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getFid());
			ptmt.setString(2, dto.getFpw());
			
			ptmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
	
	
	public GalleryDTO idPwChk(GalleryDTO dto){
		
		sql = "select * from gallery where fid = ? and fpw = ?";
		GalleryDTO res = null;
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getFid());
			ptmt.setString(2, dto.getFpw());
			
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				res = new GalleryDTO();
				res.setFid(rs.getInt("fid"));
				res.setFupfile(rs.getString("fupfile"));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	
	
	
	public int modify(BoardDTO dto){
		
		int res = 0;
		
		sql = "update board set title = ?, pname = ?, upfile = ?, content = ? "+
		" where id = ? and pw = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getTitle());
			ptmt.setString(2, dto.getPname());
			ptmt.setString(3, dto.getUpfile());
			ptmt.setString(4, dto.getContent());
			ptmt.setInt(5, dto.getId());
			ptmt.setString(6, dto.getPw());
			
			res = ptmt.executeUpdate();
							
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}
	
	
	
	
	public void reply(BoardDTO dto){
		
		try {
			
			sql = "update board set seq = seq +1 where gid = ? and seq > ?";
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getGid());
			ptmt.setInt(2, dto.getSeq());
			
			ptmt.executeUpdate();
			ptmt.close();
			
			
			sql = "select max(id)+1 from board";
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next();
			dto.setId(rs.getInt(1));
			
			
			ptmt.close();
			
			sql = "insert into board " +
					"(id, title, pname, pw, upfile, content, seq, lev, gid, cnt, reg_date) "+ 
					 "values (?, ?, ?, ?, ?, ?, ?, ?, ? ,-1, sysdate() )";
			
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getTitle());
			ptmt.setString(3, dto.getPname());
			ptmt.setString(4, dto.getPw());
			ptmt.setString(5, dto.getUpfile());
			ptmt.setString(6, dto.getContent());
			ptmt.setInt(7, dto.getSeq()+1);
			ptmt.setInt(8, dto.getLev()+1);
			ptmt.setInt(9, dto.getGid());
			ptmt.executeUpdate();
			

				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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

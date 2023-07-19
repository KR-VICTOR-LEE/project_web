package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.JDBCUtil;

public class ProductDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 상품 목록 보기
	
	public List<Product> getProductList(){
		List<Product> productsList = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		String sql = "select * from product";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getString("p_id"));
				product.setPname(rs.getString("p_name"));
				product.setUnitPrice(rs.getInt("p_unitPrice"));
				product.setDescription(rs.getString("p_description"));
				product.setCategory(rs.getString("p_category"));
				product.setMenufacturer(rs.getString("p_menufacturer"));
				product.setUnitsInStock(rs.getLong("p_unitsInStock"));
				product.setCondition(rs.getString("p_condition"));
				product.setProductImage(rs.getString("p_productImage"));
				
				productsList.add(product); // 리스트에 상품 저장
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return productsList;
	}
}

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	
	String sql;
}

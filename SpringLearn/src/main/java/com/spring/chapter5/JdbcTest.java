package com.spring.chapter5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcTest {

	private static final String SQL_INSERT_SPITTER = "insert into spitter (username, password, fullname) values (?, ?, ?)";
	
	private DataSource dataSource;
	
	public void addSpitter(Spitter spitter) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT_SPITTER);
			stmt.setString(1, spitter.getUserName());
			stmt.setString(2, spitter.getPassword());
			stmt.setString(3, spitter.getFullName());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}
}

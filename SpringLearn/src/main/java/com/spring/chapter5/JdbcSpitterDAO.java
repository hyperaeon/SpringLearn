package com.spring.chapter5;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcSpitterDAO implements SpitterDAO {

	@SuppressWarnings("deprecation")
	private SimpleJdbcTemplate jdbcTemplate;

	private static String SQL_INSERT_SPITTER = "";

	private static final String SQL_UPDATE_SPITTER = "update spitter set username=:username,"
			+ " password=:password, fullname=:fullname"
			+ " where id=:id";

	/**
	 * @return the jdbcTemplate
	 */
	public SimpleJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate
	 *            the jdbcTemplate to set
	 */
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void addSpitter(Spitter spitter) {

		jdbcTemplate.update(SQL_INSERT_SPITTER, spitter.getUserName(),
				spitter.getPassword(), spitter.getFullName());
		spitter.setId(queryForIdentity());
	}

	public Spitter getSpitterById(long id) {
		return jdbcTemplate.queryForObject(SQL_INSERT_SPITTER,
				new ParameterizedRowMapper<Spitter>() {
					public Spitter mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Spitter spitter = new Spitter();
						spitter.setId(rs.getLong(1));
						spitter.setUserName(rs.getString(2));
						return spitter;
					}
				}, id);
	}

	public long queryForIdentity() {
		return 0;
	}
}

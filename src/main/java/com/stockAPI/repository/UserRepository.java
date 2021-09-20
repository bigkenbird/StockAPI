package com.stockAPI.repository;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public Integer add(User user) {
		SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(user);
		String sql = " INSERT INTO stockapi.users ( ACCOUNT, NAME, PASSWORD ) "
				   + " VALUE ( :account, :name, :password ) " ;
		return namedParameterJdbcTemplate.update(sql, sqlParameterSource);
	}
	
	public User getDataByAccount(String account) {
		String sql = " SELECT * FROM stockapi.users "
				   + " WHERE ACCOUNT = ? " ;
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),new Object[] {account});
	}
}

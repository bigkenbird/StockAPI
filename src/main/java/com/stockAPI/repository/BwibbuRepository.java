package com.stockAPI.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import com.stockAPI.model.Bwibbu;

@Repository
public class BwibbuRepository {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public int[] insert(Bwibbu[] bwibbus) {
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch((Object[])bwibbus);
		String sql = " INSERT INTO stockapi.bwibbu ( "
				   + " code, name, pe_ratio, dividend_yield, pb_ratio"
				   + " ) "
				   + " VALUES ( :code, :name, :pEratio, :dividendYield, :pBratio ) ";
		int[] insertCounts = namedParameterJdbcTemplate.batchUpdate(sql, batch);
		return insertCounts;
	}
}

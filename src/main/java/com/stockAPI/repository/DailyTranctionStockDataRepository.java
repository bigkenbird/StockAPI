package com.stockAPI.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.stockAPI.model.DailyTranctionStockData;

@Repository
public class DailyTranctionStockDataRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public Integer add(DailyTranctionStockData dailyTranctionStockData) {
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(dailyTranctionStockData);
		String sql = " INSERT INTO stockapi.daily_tranction_stock_data ( "
				   + " CODE, NAME, TRADE_VOLUME, TRADE_VALUE, OPENING_PRICE, HIGHEST_PRICE, LOWEST_PRICE,"
				   + " CLOSING_PRICE, CHANGE_GAP, TRANSACTION_COUNT ) "
				   + " VALUE ( :code, :name, :tradevolume, :tradevalue, :openingprice, :highestprice,"
				   + " :lowestprice, :closingprice, :change_gap, :transaction_count ) " ;
		namedParameterJdbcTemplate.update(sql, sqlParameterSource,keyHolder);
		return keyHolder.getKey().intValue();
	}
	
	public int[] batchAdd(DailyTranctionStockData[] dailyTranctionStockData_array) {
		List<DailyTranctionStockData> dailyTranctionStockData_list = new ArrayList<DailyTranctionStockData>();
		for(DailyTranctionStockData dailyTranctionStockData:dailyTranctionStockData_array) {
			dailyTranctionStockData_list.add(dailyTranctionStockData);
		}
		String sql = " INSERT INTO stockapi.daily_tranction_stock_data ( "
				   + " CODE, NAME, TRADE_VOLUME, TRADE_VALUE, OPENING_PRICE, HIGHEST_PRICE, LOWEST_PRICE,"
				   + " CLOSING_PRICE, CHANGE_GAP, TRANSACTION_COUNT ) "
				   + " VALUES ( :code, :name, :trade_volume, :trade_value, :opening_price, :highest_price,"
				   + " :lowest_price, :closing_price, :change_gap, :transaction_count ) " ;
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(dailyTranctionStockData_list.toArray());
		int[] updateCounts = namedParameterJdbcTemplate.batchUpdate(sql, batch);
		return updateCounts;
		
	}
 
}

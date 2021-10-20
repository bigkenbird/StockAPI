package com.stockAPI.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DailyTranctionStockData {
	
	//上市個股日成交資訊

//	{
//		  "Code": "string", //證券代號
//		  "Name": "string", //證券名稱
//		  "TradeVolume": "string", //成交股數
//		  "TradeValue": "string", //成交金額
//		  "OpeningPrice": "string", //開盤價
//		  "HighestPrice": "string", //最高價
//		  "LowestPrice": "string", //最低價
//		  "ClosingPrice": "string", //收盤價
//		  "Change": "string", //漲跌價差
//		  "Transaction": "string" //成交筆數
//		}
	
	private Integer id;
	private Timestamp create_time;
	
	@JsonProperty(value="Code")
	private String code;
	
	@JsonProperty(value="Name")
	private String name;
	
	@JsonProperty(value="TradeVolume")
	private Integer trade_volume;
	
	@JsonProperty(value="TradeValue")
	private BigInteger trade_value;
	
	@JsonProperty(value="OpeningPrice")
	private BigDecimal opening_price;
	
	@JsonProperty(value="HighestPrice")
	private BigDecimal highest_price;
	
	@JsonProperty(value="LowestPrice")
	private BigDecimal lowest_price;
	
	@JsonProperty(value="ClosingPrice")
	private BigDecimal closing_price;
	
	@JsonProperty(value="Change")
	private BigDecimal change_gap;
	
	@JsonProperty(value="Transaction")
	private Integer transaction_count;
	
	
}

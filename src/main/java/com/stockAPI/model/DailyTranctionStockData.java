package com.stockAPI.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="daily_tranction_stock_data")
@Data
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="CREATE_TIME")
	private Timestamp create_time;
	
	@JsonProperty(value="Code")
	@Column(name="CODE")
	private String code;
	
	@JsonProperty(value="Name")
	@Column(name="NAME")
	private String name;
	
	@JsonProperty(value="TradeVolume")
	@Column(name="TRADE_VOLUME")
	private Integer trade_volume;
	
	@JsonProperty(value="TradeValue")
	@Column(name="TRADE_VALUE")
	private BigInteger trade_value;
	
	@JsonProperty(value="OpeningPrice")
	@Column(name="OPENING_PRICE")
	private BigDecimal opening_price;
	
	@JsonProperty(value="HighestPrice")
	@Column(name="HIGHEST_PRICE")
	private BigDecimal highest_price;
	
	@JsonProperty(value="LowestPrice")
	@Column(name="LOWEST_PRICE")
	private BigDecimal lowest_price;
	
	@JsonProperty(value="ClosingPrice")
	@Column(name="CLOSING_PRICE")
	private BigDecimal closing_price;
	
	@JsonProperty(value="Change")
	@Column(name="CHANGE_GAP")
	private BigDecimal change_gap;
	
	@JsonProperty(value="Transaction")
	@Column(name="TRANSACTION_COUNT")
	private Integer transaction_count;
	
	
}

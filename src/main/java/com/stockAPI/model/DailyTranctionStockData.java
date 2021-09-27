package com.stockAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
	
	@JsonProperty(value="Code")
	private String code;
	
	@JsonProperty(value="Name")
	private String name;
	
	@JsonProperty(value="TradeVolume")
	private String tradevolume;
	
	@JsonProperty(value="TradeValue")
	private String tradevalue;
	
	@JsonProperty(value="OpeningPrice")
	private String openingprice;
	
	@JsonProperty(value="HighestPrice")
	private String highestprice;
	
	@JsonProperty(value="LowestPrice")
	private String lowestprice;
	
	@JsonProperty(value="ClosingPrice")
	private String closingprice;
	
	@JsonProperty(value="Change")
	private String change;
	
	@JsonProperty(value="Transaction")
	private String transaction;
	
	public DailyTranctionStockData() {
		
	}

	public DailyTranctionStockData(String code, String name, String tradevolume, String tradevalue, String openingprice,
			String highestprice, String lowestprice, String closingprice, String change, String transaction) {
		super();
		this.code = code;
		this.name = name;
		this.tradevolume = tradevolume;
		this.tradevalue = tradevalue;
		this.openingprice = openingprice;
		this.highestprice = highestprice;
		this.lowestprice = lowestprice;
		this.closingprice = closingprice;
		this.change = change;
		this.transaction = transaction;
	}
	
	
}

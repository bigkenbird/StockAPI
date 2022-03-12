package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteInfo {
	
	@JsonProperty(value="data")
	private String date;
	
	@JsonProperty(value="type")
	private String type;
	
	@JsonProperty(value="exchange")
	private String exchange;
	
	@JsonProperty(value="market")
	private String market;
	
	@JsonProperty(value="symbolId")
	private String symbolId;
	
	@JsonProperty(value="countryCode")
	private String countryCode;
	
	@JsonProperty(value="timeZone")
	private String timeZone;
	
	@JsonProperty(value="lastUpdatedAt")
	private String lastUpdatedAt;
	

}

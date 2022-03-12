package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteTrial {
	
	@JsonProperty("at")
	private String at;
	
	@JsonProperty("bid")
	private String bid;
	
	@JsonProperty("ask")
	private String ask;
	
	@JsonProperty("price")
	private String price;
	
	@JsonProperty("volume")
	private String volume;
	
	@JsonProperty("serial")
	private String serial;
	

}

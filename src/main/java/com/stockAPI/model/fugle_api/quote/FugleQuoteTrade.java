package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteTrade {
	
	@JsonProperty(value="at")
	private String at;
	
	@JsonProperty(value="bid")
	private String bid;
	
	@JsonProperty(value="ask")
	private String ask;
	
	@JsonProperty(value="price")
	private String price;
	
	@JsonProperty(value="volume")
	private String volume;
	
	@JsonProperty(value="serial")
	private String serial;

}

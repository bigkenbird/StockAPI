package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteOrder {
	
	@JsonProperty("at")
	private String at;
	
	@JsonProperty("bids")
	private FugleQuoteBid[] bids;
	
	@JsonProperty("asks")
	private FugleQuoteAsk[] asks;
	
	

}

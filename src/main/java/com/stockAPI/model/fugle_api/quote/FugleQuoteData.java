package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteData {
	
	@JsonProperty(value = "info")
	private FugleQuoteInfo info;
	
	@JsonProperty(value = "quote")
	private FugleQuotequote quote;

}

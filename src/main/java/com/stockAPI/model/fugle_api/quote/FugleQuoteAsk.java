package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteAsk {
	
	@JsonProperty(value="price")
	private String price;
	
	@JsonProperty(value="volume")
	private String volume;

}

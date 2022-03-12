package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuotePriceHigh {
	
	@JsonProperty(value="price")
	private String price;
	
	@JsonProperty(value="at")
	private String at;

}

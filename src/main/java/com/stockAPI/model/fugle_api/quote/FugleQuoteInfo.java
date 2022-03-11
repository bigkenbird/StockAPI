package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteInfo {
	
	@JsonProperty(value="data")
	private String date;
	
	private String type;

}

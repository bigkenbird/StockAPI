package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuoteTotal {
	
	@JsonProperty("at")
	private String at;
	
	@JsonProperty("transaction")
	private String transaction;
	
	@JsonProperty("tradeValue")
	private String tradeValue;
	
	@JsonProperty("tradeVolume")
	private String tradeVolume;
	
	@JsonProperty("tradeVolumeAtBid")
	private String tradeVolumeAtBid;
	
	@JsonProperty("tradeVolumeAtAsk")
	private String tradeVolumeAtAsk;
	
	@JsonProperty("serial")
	private String serial;
	

}

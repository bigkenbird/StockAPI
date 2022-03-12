package com.stockAPI.model.fugle_api.quote;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FugleQuotequote {
	
	@JsonProperty("isCurbing")
	private Boolean  isCurbing;
	
	@JsonProperty("isCurbingFall")
	private Boolean  isCurbingFall;
	
	@JsonProperty("isCurbingRise")
	private Boolean  isCurbingRise;
	
	@JsonProperty("isTrial")
	private Boolean  isTrial;
	
	@JsonProperty("isOpenDelayed")
	private Boolean  isOpenDelayed;
	
	@JsonProperty("isCloseDelayed")
	private Boolean  isCloseDelayed;
	
	@JsonProperty("isHalting")
	private Boolean  isHalting;
	
	@JsonProperty("isClosed")
	private Boolean  isClosed;
	
	@JsonProperty("total")
	private FugleQuoteTotal total;
	
	@JsonProperty("trial")
	private FugleQuoteTrial trial;
	
	@JsonProperty("trade")
	private FugleQuoteTrade trade;
	
	@JsonProperty("order")
	private FugleQuoteOrder order;
	
	@JsonProperty("priceHigh")
	private FugleQuotePriceHigh priceHigh;
	
	@JsonProperty("priceLow")
	private FugleQuotePriceLow priceLow;
	
	@JsonProperty("priceOpen")
	private FugleQuotePriceOpen priceOpen;
	
	@JsonProperty("priceAvg")
	private FugleQuotePriceAvg priceAvg;
	
	@JsonProperty("change")
	private String change;
	
	@JsonProperty("changePercent")
	private String changePercent;
	
	@JsonProperty("amplitude")
	private String amplitude;
	
	@JsonProperty("priceLimit")
	private String priceLimit;

}

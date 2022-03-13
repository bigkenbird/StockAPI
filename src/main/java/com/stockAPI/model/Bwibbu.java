package com.stockAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Bwibbu {
	
	@JsonProperty(value="Code")
	private String code;
	
	@JsonProperty(value="Name")
	private String name;
	
	@JsonProperty(value="PEratio")
	private double pEratio;
	
	@JsonProperty(value="DividendYield")
	private double dividendYield;
	
	@JsonProperty(value="PBratio")
	private double pBratio;
	
	
	

}

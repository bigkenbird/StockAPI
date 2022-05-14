package com.stockAPI.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@Table(name="bwibbu")
public class Bwibbu {
	
	@JsonProperty(value="Code")
	@Id
	@Column(name="CODE")
	private String code;
	
	@JsonProperty(value="Name")
	@Column(name="NAME")
	private String name;
	
	@JsonProperty(value="PEratio")
	@Column(name="PE_RATIO")
	private double pEratio;
	
	@JsonProperty(value="DividendYield")
	@Column(name="DIVIDEND_YIELD")
	private double dividendYield;
	
	@JsonProperty(value="PBratio")
	@Column(name="PB_RATIO")
	private double pBratio;
	
	@Column(name="CREATE_TIME",insertable = false,updatable = false)
	private Timestamp createTime;
	
	
	

}

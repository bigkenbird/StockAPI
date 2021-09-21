package com.stockAPI.model;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class APIReturnObject {
	
	private String message;
	
	private Map<String, Object> data;

}

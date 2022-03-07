package com.stockAPI.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.stockAPI.service.LineNotifyService;

public class LineNotifyServiceImpl implements LineNotifyService {
	
	@Value("{lineNotifyBot.getToken}")
	private String lineNotifyBot_getToken;
	
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public String getAccessToken() {
		
		
		
		
		
		return null;
	}

}

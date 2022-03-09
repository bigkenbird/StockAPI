package com.stockAPI.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stockAPI.model.line_notify_api.LineNotify;
import com.stockAPI.model.line_notify_api.LineNotifyReturn;
import com.stockAPI.service.LineNotifyService;
import com.stockAPI.util.LineNotifyApiUtil;


@Service
public class LineNotifyServiceImpl implements LineNotifyService {
	
	@Value("${lineNotifyBot.notifyUrl}")
	private String lineNotifyBot_notifyUrl;
	
	@Value("${lineNotifyBot.testToken}")
	private String lineNotifyBot_testToken;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public void notify(LineNotify lineNotify) {
		try {
		LineNotifyApiUtil.send(
					lineNotifyBot_testToken, 
					lineNotifyBot_notifyUrl,
					HttpMethod.POST ,
					convert(lineNotify),
					LineNotifyReturn.class);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	MultiValueMap<String, String> convert(Object obj) {
	    MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
	    Map<String, String> maps = objectMapper.convertValue(obj, new TypeReference<Map<String, String>>() {});
	    parameters.setAll(maps);
	    return parameters;
	}
}

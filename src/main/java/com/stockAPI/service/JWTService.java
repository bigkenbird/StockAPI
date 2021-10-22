package com.stockAPI.service;

import java.util.Map;

import com.stockAPI.model.User;


public interface JWTService {


	public String generateToken(User user);
	
	public Map<String, Object> parseToken(String token);
	       
}

package com.stockAPI.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.stockAPI.model.StockUser;
import com.stockAPI.model.User;


public interface StockUserService extends UserDetailsService {
	
	public Integer addUser(User user);
	
	public StockUser getOwnData(String account);
}

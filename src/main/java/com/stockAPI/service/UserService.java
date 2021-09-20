package com.stockAPI.service;

import org.springframework.stereotype.Service;

import com.stockAPI.model.APIUser;
import com.stockAPI.model.StockUser;

@Service
public class UserService {
	
	public StockUser getStockUserByUserName(String username) {
		if("ken".equals(username)) {
			APIUser apiUser = new APIUser("ken","123");
			return new StockUser(apiUser);
		}
		return null;
	}

}

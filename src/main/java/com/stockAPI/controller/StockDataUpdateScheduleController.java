package com.stockAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.stockAPI.repository.BwibbuRepository;
import com.stockAPI.service.TWSIOpenService;

public class StockDataUpdateScheduleController {
	
	@Autowired
	TWSIOpenService tWSIOpenService;
	
	@Autowired
	BwibbuRepository bwibbuRepository;
	
	public void updateStockData() {
		
		tWSIOpenService.updateDailyBwibbu();
	}

}

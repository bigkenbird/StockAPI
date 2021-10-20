package com.stockAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.repository.DailyTranctionStockDataRepository;
import com.stockAPI.service.ScheduleService;
import com.stockAPI.service.TWSIOpenService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	TWSIOpenService  tWSIOpenService;
	
	@Autowired
	DailyTranctionStockDataRepository dailyTranctionStockDataRepository;
	
	@Override
	public void schedule_AddDailyTranctionStockData() {
		DailyTranctionStockData[] dailyTranctionStockData_array = tWSIOpenService.getDailyTranctionStockData();
		dailyTranctionStockDataRepository.batchAdd(dailyTranctionStockData_array);
	}
	
	

}

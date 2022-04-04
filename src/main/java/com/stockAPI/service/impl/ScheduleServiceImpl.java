package com.stockAPI.service.impl;


import java.util.Arrays;
import java.util.List;

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
		List<DailyTranctionStockData> dailyTranctionStockData_list  =  Arrays.asList(dailyTranctionStockData_array);
		dailyTranctionStockDataRepository.saveAll(dailyTranctionStockData_list);
	}
	
	

}

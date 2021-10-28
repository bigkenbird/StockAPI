package com.stockAPI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;
import com.stockAPI.service.ScheduleService;
import com.stockAPI.service.TWSIOpenService;

@SpringBootTest
class StockApiApplicationTests {
	
	static Logger logger=LogManager.getLogger();
	
	@Autowired
	TWSIOpenService tWSIOpenService;
	
	@Autowired
	ScheduleService scheduleService;

	
	void schedule_AddDailyTranctionStockData() {
		scheduleService.schedule_AddDailyTranctionStockData();
		}
	
	@Test
	void getDailyTranctionStockData() {
		DailyTranctionStockData[]  resultList = tWSIOpenService.getDailyTranctionStockData();
		for(DailyTranctionStockData result:resultList) {
			logger.info(result.getTrade_value());
		}
	}
	
	void getGeneralBalanceSheet() {
		GeneralBalanceSheet[]  resultList = tWSIOpenService.getGeneralBalanceSheet();
		
		}
}

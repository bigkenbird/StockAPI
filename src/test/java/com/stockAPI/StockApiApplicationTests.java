package com.stockAPI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;
import com.stockAPI.model.fugle_api.quote.FugleQuote;
import com.stockAPI.service.FugleQuoteService;
import com.stockAPI.service.LineNotifyService;
import com.stockAPI.service.ScheduleService;
import com.stockAPI.service.TWSIOpenService;

@SpringBootTest
public class StockApiApplicationTests {
	
	static Logger logger=LogManager.getLogger();
	
	@Autowired
	TWSIOpenService tWSIOpenService;
	
	@Autowired
	ScheduleService scheduleService;
	
	@Autowired
	LineNotifyService lineNotifyService;
	
	@Autowired
	FugleQuoteService fugleQuoteService;

	
	void schedule_AddDailyTranctionStockData() {
		scheduleService.schedule_AddDailyTranctionStockData();
		}
	
	
	void getDailyTranctionStockData() {
		DailyTranctionStockData[]  resultList = tWSIOpenService.getDailyTranctionStockData();
		for(DailyTranctionStockData result:resultList) {
			logger.info(result.getName());
		}
	}
	
	void getGeneralBalanceSheet() {
		GeneralBalanceSheet[]  resultList = tWSIOpenService.getGeneralBalanceSheet();
		
		}
	@Test
	void LineNotify() {
		FugleQuote result =fugleQuoteService.getRealTimeData("2884", true);
		logger.info(result);
	}
	
}

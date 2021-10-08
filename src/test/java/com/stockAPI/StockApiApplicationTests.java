package com.stockAPI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stockAPI.service.TWSIOpenService;

@SpringBootTest
class StockApiApplicationTests {
	
	static Logger logger=LogManager.getLogger();
	
	@Autowired
	TWSIOpenService tWSIOpenService;

	@Test
	void contextLoads() {
		
		tWSIOpenService.schedule_AddDailyTranctionStockData();
	 
}
}

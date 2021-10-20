package com.stockAPI.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.stockAPI.service.ScheduleService;
import com.stockAPI.service.TWSIOpenService;

@Component
public class DailySchedule {
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	 @Autowired
	 TWSIOpenService tWSIOpenService;
	 
	 @Autowired
	 ScheduleService scheduleService;
	 
	 //上市個股日成交資訊-存入 下午五點寫入
	 @Scheduled(cron = "0 0 17 * * ?") 
	 public void saveDailyTranctionStockData() {
		 scheduleService.schedule_AddDailyTranctionStockData();
		 logger.info("上市個股日成交資訊-存入 下午五點寫入");
	 }
}

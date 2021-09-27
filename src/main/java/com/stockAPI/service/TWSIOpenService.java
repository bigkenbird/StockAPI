package com.stockAPI.service;

import org.springframework.stereotype.Service;
import com.stockAPI.enumsave.TWSIOpenAPIUrl;
import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.util.TWSIOpenAPIUtil;

@Service
public class TWSIOpenService {
	
	public DailyTranctionStockData[] getDailyTranctionStockData(){
		DailyTranctionStockData[] resultList =
		TWSIOpenAPIUtil.send(
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getUrl(),
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getMethod(),
				DailyTranctionStockData[].class);
		return	resultList;
	}

}

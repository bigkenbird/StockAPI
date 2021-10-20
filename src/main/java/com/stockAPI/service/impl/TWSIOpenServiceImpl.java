package com.stockAPI.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockAPI.enumsave.TWSIOpenAPIUrl;
import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;
import com.stockAPI.repository.DailyTranctionStockDataRepository;
import com.stockAPI.service.TWSIOpenService;
import com.stockAPI.util.TWSIOpenAPIUtil;

@Service
public class TWSIOpenServiceImpl implements TWSIOpenService{
	
	@Autowired
	DailyTranctionStockDataRepository dailyTranctionStockDataRepository;
	
	public DailyTranctionStockData[] getDailyTranctionStockData(){
		DailyTranctionStockData[] resultList =
		TWSIOpenAPIUtil.send(
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getUrl(),
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getMethod(),
				DailyTranctionStockData[].class);
		return	resultList;
	}

	@Override
	public GeneralBalanceSheet[] getGeneralBalanceSheet() {
		GeneralBalanceSheet[] resultList =
		TWSIOpenAPIUtil.send(
				TWSIOpenAPIUrl.FINANCE_GENERAL_BALANCE_SHEET.getUrl(),
				TWSIOpenAPIUrl.FINANCE_GENERAL_BALANCE_SHEET.getMethod(),
				GeneralBalanceSheet[].class);
		return	resultList;
	}
	
	

}

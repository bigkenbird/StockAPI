package com.stockAPI.service;

import org.springframework.stereotype.Service;

import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;

@Service
public interface TWSIOpenService {
	
	
	public DailyTranctionStockData[] getDailyTranctionStockData();
	
	
	
	//財務報表
	public GeneralBalanceSheet[] getGeneralBalanceSheet();
	
	

}

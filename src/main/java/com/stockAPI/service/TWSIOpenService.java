package com.stockAPI.service;

import org.springframework.stereotype.Service;

import com.stockAPI.model.Bwibbu;
import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;

@Service
public interface TWSIOpenService {
	
	//證卷交易
	public DailyTranctionStockData[] getDailyTranctionStockData();
	
	public Bwibbu[] getDailyBwibbu();
	
	public void updateDailyBwibbu();
	
	
	
	//財務報表
	public GeneralBalanceSheet[] getGeneralBalanceSheet();
	
	

}

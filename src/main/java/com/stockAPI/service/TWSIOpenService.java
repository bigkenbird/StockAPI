package com.stockAPI.service;

import org.springframework.stereotype.Service;

import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.entity.Bwibbu;
import com.stockAPI.model.financial_statement.DifferentBalanceSheet;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;

@Service
public interface TWSIOpenService {
	
	//證卷交易
	public DailyTranctionStockData[] getDailyTranctionStockData();
	
	public Bwibbu[] getDailyBwibbu();
	
	public void updateDailyBwibbu();
	
	
	
	//財務報表
	public GeneralBalanceSheet[] getGeneralBalanceSheet(); //查詢一般業公發公司資產負債表
	public void saveGeneralBalanceSheet(GeneralBalanceSheet[] generalBalanceSheets); //儲存一般業公發公司資產負債表
	public DifferentBalanceSheet[] getDifferentBalanceSheet();//異業公發公司資產負債表
	
	
	

}

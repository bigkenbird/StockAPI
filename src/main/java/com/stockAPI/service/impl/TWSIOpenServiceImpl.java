package com.stockAPI.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockAPI.enumsave.TWSIOpenAPIUrl;
import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;
import com.stockAPI.repository.DailyTranctionStockDataRepository;
import com.stockAPI.service.TWSIOpenService;
import com.stockAPI.util.BaseUtil;
import com.stockAPI.util.TWSIOpenAPIUtil;

@Service
public class TWSIOpenServiceImpl implements TWSIOpenService{
	
	Logger logger=LogManager.getLogger();
	
	@Autowired
	DailyTranctionStockDataRepository dailyTranctionStockDataRepository;
	
	public DailyTranctionStockData[] getDailyTranctionStockData(){
		DailyTranctionStockData[] api_resultArray =
		TWSIOpenAPIUtil.send(
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getUrl(),
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getMethod(),
				DailyTranctionStockData[].class);
		
		List<DailyTranctionStockData> api_resultList= BaseUtil.transArrayToList(api_resultArray);
		
		//刪除無交易金額的資料
		api_resultList=api_resultList.stream().filter(element->element.getTrade_value()!=null).collect(Collectors.toList());
		//根據成交金額進行排列(由大至小)
		List<DailyTranctionStockData> api_resultList_sorted = api_resultList.stream().sorted(Comparator.comparing(DailyTranctionStockData::getTrade_value).reversed()).collect(Collectors.toCollection(ArrayList::new));
		DailyTranctionStockData[] resultArray = api_resultList_sorted.toArray(new DailyTranctionStockData[0]);
		return	resultArray;
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

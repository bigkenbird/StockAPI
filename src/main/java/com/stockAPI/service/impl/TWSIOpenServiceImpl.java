package com.stockAPI.service.impl;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockAPI.assembler.GeneralBalanceSheetAssembler;
import com.stockAPI.enumsave.TWSIOpenAPIUrl;
import com.stockAPI.enumsave.TWSIOpenExceptionEnum;
import com.stockAPI.exception.TWSIOpenSeviceException;
import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.entity.Bwibbu;
import com.stockAPI.model.entity.GeneralBalanceSheetEntity;
import com.stockAPI.model.financial_statement.DifferentBalanceSheet;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;
import com.stockAPI.repository.BwibbuRepository;
import com.stockAPI.repository.DailyTranctionStockDataRepository;
import com.stockAPI.repository.GeneralBalanceSheetRepository;
import com.stockAPI.service.TWSIOpenService;
import com.stockAPI.util.BaseUtil;
import com.stockAPI.util.TWSIOpenAPIUtil;


@Service
public class TWSIOpenServiceImpl implements TWSIOpenService{
	
	Logger logger=LogManager.getLogger();
	
	@Autowired
	DailyTranctionStockDataRepository dailyTranctionStockDataRepository;
	
	@Autowired
	BwibbuRepository bwibbuRepository;
	
	@Autowired
	GeneralBalanceSheetRepository generalBalanceSheetRepository;
	
	public DailyTranctionStockData[] getDailyTranctionStockData(){
		DailyTranctionStockData[] api_resultArray =
		TWSIOpenAPIUtil.send(
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getUrl(),
				TWSIOpenAPIUrl.EXCHANGE_REPORT_STOCK_DAY_ALL.getMethod(),
				DailyTranctionStockData[].class);
		
		List<DailyTranctionStockData> api_resultList= BaseUtil.transArrayToList(api_resultArray);
		Comparator<DailyTranctionStockData> comparator = (a,b) -> 
		Optional.ofNullable(a).map(DailyTranctionStockData::getTrade_value).orElse(new BigInteger("0"))
		.compareTo(Optional.ofNullable(b).map(DailyTranctionStockData::getTrade_value).orElse(new BigInteger("0")));
				
		
		//刪除無交易金額的資料->根據成交金額進行排列(由大至小)
		List<DailyTranctionStockData> api_resultList_sorted = 
				api_resultList.stream().sorted(
				comparator.reversed()
				).collect(Collectors.toList());
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
		if(BaseUtil.checkArrayIsEmpty(resultList)) {
			throw new TWSIOpenSeviceException(
					TWSIOpenExceptionEnum.FINANCE_GENERAL_BALANCE_SHEET_SEARCH_NO_DATA.getCode(),
					TWSIOpenExceptionEnum.FINANCE_GENERAL_BALANCE_SHEET_SEARCH_NO_DATA.getMessage());
		}
			
		return	resultList;
	}

	@Override
	public Bwibbu[] getDailyBwibbu() {
		Bwibbu[] bwibbus
			= TWSIOpenAPIUtil.send(
					TWSIOpenAPIUrl.EXCHANGE_REPORT_BWIBBU_ALL.getUrl(), 
					TWSIOpenAPIUrl.EXCHANGE_REPORT_BWIBBU_ALL.getMethod(),
					Bwibbu[].class);
		return bwibbus;
	}

	@Override
	public void updateDailyBwibbu() {
		Bwibbu[] bwibbus_array = getDailyBwibbu();
		List<Bwibbu> bwibbus_list =Arrays.asList(bwibbus_array);
		bwibbuRepository.saveAll(bwibbus_list.subList(0, 10));
	}

	@Override
	public DifferentBalanceSheet[] getDifferentBalanceSheet() {
		DifferentBalanceSheet[] resultList =
				TWSIOpenAPIUtil.send(
						TWSIOpenAPIUrl.FINANCE_DIFFERENT_BALANCE_SHEET.getUrl(),
						TWSIOpenAPIUrl.FINANCE_DIFFERENT_BALANCE_SHEET.getMethod(),
						DifferentBalanceSheet[].class);
		return	resultList;
	}

	@Override
	public void saveGeneralBalanceSheet(GeneralBalanceSheet[] generalBalanceSheets) {
	try {
		 List<GeneralBalanceSheet> generalBalanceSheet_list = Arrays.asList(generalBalanceSheets);
		 List<GeneralBalanceSheetEntity> generalBalanceSheetEntity_list =
				 GeneralBalanceSheetAssembler.toEntity(generalBalanceSheet_list);
		 
		 
		 generalBalanceSheetRepository.saveAll(generalBalanceSheetEntity_list);
	}
	catch (Exception e) {
		logger.error("TWSIOpenServiceImpl saveGeneralBalanceSheet 發生錯誤,錯誤訊息：{}",e.getMessage());
		throw new TWSIOpenSeviceException(
				TWSIOpenExceptionEnum.FINANCE_GENERAL_BALANCE_SHEET_INSERT_FAIL.getCode(),
				TWSIOpenExceptionEnum.FINANCE_GENERAL_BALANCE_SHEET_INSERT_FAIL.getMessage());
	}
	
	}
	
	

}

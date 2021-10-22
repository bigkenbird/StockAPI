package com.stockAPI.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockAPI.model.APIReturnObject;
import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.model.financial_statement.GeneralBalanceSheet;
import com.stockAPI.service.TWSIOpenService;

@RestController
@RequestMapping("stock/search")
@CrossOrigin("*")
public class StockSearchController {
	
	@Autowired
	TWSIOpenService tWSIOpenService;
	
	
	
	@GetMapping("exchange/getStockDayAll")
	public APIReturnObject getStockDayAll() {
		APIReturnObject aPIReturnObject = new APIReturnObject();
		Map<String, Object> data = new HashMap<String, Object>();
		DailyTranctionStockData[]  dailyTranctionStockDatas = tWSIOpenService.getDailyTranctionStockData();
		aPIReturnObject.setMessage("上市個股日成交資訊-取得成功");
		data.put("dailyTranctionStockDatas", dailyTranctionStockDatas);
		aPIReturnObject.setData(data);
		return aPIReturnObject;
		
	}
	
	
	@GetMapping("finance/getGeneralBalanceSheet")
	public APIReturnObject getGeneralBalanceSheet() {
		APIReturnObject aPIReturnObject = new APIReturnObject();
		Map<String, Object> data = new HashMap<String, Object>();
		GeneralBalanceSheet[]  generalBalanceSheet = tWSIOpenService.getGeneralBalanceSheet();
		aPIReturnObject.setMessage("公發公司資產負債表-一般業資訊-取得成功");
		data.put("generalBalanceSheet", generalBalanceSheet);
		aPIReturnObject.setData(data);
		return aPIReturnObject;
		
	}

}

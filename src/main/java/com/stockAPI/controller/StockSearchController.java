package com.stockAPI.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockAPI.model.APIReturnObject;
import com.stockAPI.model.DailyTranctionStockData;
import com.stockAPI.service.TWSIOpenService;

@RestController
@RequestMapping("stock/search")
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

}

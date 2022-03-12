package com.stockAPI.service;

import com.stockAPI.model.fugle_api.quote.FugleQuote;

public interface FugleQuoteService {
	
	public FugleQuote getRealTimeData(String symbolId,Boolean oddLot);

}

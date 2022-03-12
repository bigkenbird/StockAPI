package com.stockAPI.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.stockAPI.model.fugle_api.quote.FugleQuote;
import com.stockAPI.service.FugleQuoteService;
import com.stockAPI.util.FugleApiUtil;

@Service
public class FugleQuoteServiceImpl implements FugleQuoteService {
	
	@Value("${fugleApi.quoteUrl}")
	private String fugleApi_quoteUrl;
	
	@Value("${fugleApi.token}")
	private String fugleApi_token;

	@Override
	public FugleQuote getRealTimeData(String symbolId, Boolean oddLot) {
		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		String url = 
				UriComponentsBuilder.fromHttpUrl(fugleApi_quoteUrl)
				.queryParam("symbolId", "2884")
				.queryParam("apiToken", fugleApi_token)
				.encode()
				.toUriString();
				
		FugleQuote result = FugleApiUtil.send(url, HttpMethod.GET, params, FugleQuote.class);
		return result;
	}

}

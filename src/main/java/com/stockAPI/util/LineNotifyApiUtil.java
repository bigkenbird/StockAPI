package com.stockAPI.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class LineNotifyApiUtil {

	static Logger logger = LogManager.getLogger();
	

	public static <T, R> T send(String token, String url, HttpMethod method, MultiValueMap<String, String> r, Class<T> t) {

		try {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			headers.setBearerAuth(token);
			HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<MultiValueMap<String, String>>(r, headers);
			ResponseEntity<T> responseEntity = restTemplate.exchange(url,method, httpEntity, t);
			T result = responseEntity.getBody();
			logger.info(responseEntity.getStatusCode());
			return result;
		} catch (HttpClientErrorException httpClientErrorException) {
			logger.warn(httpClientErrorException.getResponseBodyAsString());
			return null;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
}

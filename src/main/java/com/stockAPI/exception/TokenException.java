package com.stockAPI.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;


public class TokenException extends BaseException {


	public TokenException(Integer code, String message,HttpStatus httpStatus) {
		super(code, message);
		this.httpStatus = httpStatus;
		
	}

	private static final long serialVersionUID = 7821518038304864265L;
	
	private HttpStatus httpStatus;

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
}

package com.stockAPI.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException {
	
	private static final long serialVersionUID = 250218130170482890L;

	public BaseException(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	protected Integer code;
	protected String message;
}

package com.stockAPI.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TokenException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	private Integer code;
	private String message;
	private HttpStatus httpStatus;

}
package com.stockAPI.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TokenException extends BaseException {


	private static final long serialVersionUID = 7821518038304864265L;
	
	private HttpStatus httpStatus;


}

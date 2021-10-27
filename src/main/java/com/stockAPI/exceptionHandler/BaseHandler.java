package com.stockAPI.exceptionHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.stockAPI.enumsave.TokenEnum;
import com.stockAPI.exception.TokenException;
import com.stockAPI.model.APIReturnObject;

import io.jsonwebtoken.ExpiredJwtException;

@RestControllerAdvice
public class BaseHandler {

	static Logger logger = LogManager.getLogger();

	// 登入驗證錯誤
	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<APIReturnObject> usernameNotFoundException(UsernameNotFoundException e) {
		APIReturnObject aPIReturnObject = new APIReturnObject();
		aPIReturnObject.setMessage(e.getMessage());
		return new ResponseEntity<APIReturnObject>(aPIReturnObject, HttpStatus.FORBIDDEN);
	}

	// token過期
	@ExceptionHandler(ExpiredJwtException.class)
	public ResponseEntity<APIReturnObject> expiredJwtException(ExpiredJwtException e) {
		APIReturnObject aPIReturnObject = new APIReturnObject();
		aPIReturnObject.setMessage(TokenEnum.TOKEN_ERROR_EXPIRED.getMessage());
		return new ResponseEntity<APIReturnObject>(aPIReturnObject, HttpStatus.REQUEST_TIMEOUT);
	}

	// 身分驗證有誤
	@ExceptionHandler(AuthenticationException.class)
	public ResponseEntity<APIReturnObject> AuthenticationException(AuthenticationException e) {
		logger.error(e.getMessage());
		APIReturnObject aPIReturnObject = new APIReturnObject();
		aPIReturnObject.setMessage(TokenEnum.TOKEN_AUTH_FAIL.getMessage());
		return new ResponseEntity<APIReturnObject>(aPIReturnObject, TokenEnum.TOKEN_AUTH_FAIL.getHttpstatus());
	}

	// token業務邏輯錯誤
	@ExceptionHandler(TokenException.class)
	public ResponseEntity<APIReturnObject> tokenException(TokenException e) {
		APIReturnObject aPIReturnObject = new APIReturnObject();
		aPIReturnObject.setMessage(e.getMessage());
		return new ResponseEntity<APIReturnObject>(aPIReturnObject, e.getHttpStatus());
	}

}

package com.stockAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.stockAPI.enumsave.StockUserServiceExceptionEnum;
import com.stockAPI.exception.StockUserServiceException;
import com.stockAPI.model.StockUser;
import com.stockAPI.model.User;
import com.stockAPI.repository.UserRepository;
import com.stockAPI.service.StockUserService;

@Service
public class StockUserServiceImpl implements StockUserService {

	@Autowired
	UserRepository userRepository;
	
	//載入套件的加密器
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepository.findByAccount(username);
		return new StockUser(user);
	}
	
	public Integer addUser(User user) {
		vertifyUser(user);
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setAuthority("NORMAL");
		Integer user_id = userRepository.save(user).getId();
		return user_id;
	}
	
	public StockUser getOwnData(String account){
		User user= userRepository.findByAccount(account);
		
		//資料內不可以含有密碼資訊
		user.setPassword(null);
		return new StockUser(user);
	}
	
	public void vertifyUser(User user) {
		String account = user.getAccount();
		String name = user.getName();
		String password = user.getPassword();
		if(!StringUtils.hasText(account)) {
			throw new StockUserServiceException(
					StockUserServiceExceptionEnum.CREATE_USER_ACCOUNT_EMPTY.getCode(),
					StockUserServiceExceptionEnum.CREATE_USER_ACCOUNT_EMPTY.getMessage()
			);
		}
		else if(!ruleAccount(account)) {
			throw new StockUserServiceException(
					StockUserServiceExceptionEnum.CREATE_USER_ACCOUNT_ILLEGAL.getCode(),
					StockUserServiceExceptionEnum.CREATE_USER_ACCOUNT_ILLEGAL.getMessage()
			);
			
		}
		else if(!StringUtils.hasText(name)) {
			throw new StockUserServiceException(
					StockUserServiceExceptionEnum.CREATE_USER_NAME_EMPTY.getCode(),
					StockUserServiceExceptionEnum.CREATE_USER_NAME_EMPTY.getMessage()
			);
		}
		else if(!ruleName(name)) {
			throw new StockUserServiceException(
					StockUserServiceExceptionEnum.CREATE_USER_NAME_ILLEGAL.getCode(),
					StockUserServiceExceptionEnum.CREATE_USER_NAME_ILLEGAL.getMessage()
			);
		}
		else if(!StringUtils.hasText(password)) {
			throw new StockUserServiceException(
					StockUserServiceExceptionEnum.CREATE_USER_PASSWORD_EMPTY.getCode(),
					StockUserServiceExceptionEnum.CREATE_USER_PASSWORD_EMPTY.getMessage()
			);
		}
		else if(!rulePassword(password)) {
			throw new StockUserServiceException(
					StockUserServiceExceptionEnum.CREATE_USER_PASSWORD_ILLEGAL.getCode(),
					StockUserServiceExceptionEnum.CREATE_USER_PASSWORD_ILLEGAL.getMessage()
			);
		}
			
		
	}
	
	public Boolean ruleAccount(String account) {
		if(account.length()<10) {
			return false;
		}
		return true;
	}
	
	public Boolean ruleName(String name) {
		if(name.length()<3) {
			return false;
		}
		return true;
	}
	
	public Boolean rulePassword(String password) {
		if(password.length()<3) {
			return false;
		}
		return true;
	}
	
}

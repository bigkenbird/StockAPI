package com.stockAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

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
		User user= userRepository.getDataByAccount(username);
		return new StockUser(user);
		
	}
	
	public Integer addUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Integer user_id = userRepository.add(user);
		return user_id;
	}
	
	public StockUser getOwnData(String account){
		User user= userRepository.getDataByAccount(account);
		
		//資料內不可以含有密碼資訊
		user.setPassword(null);
		return new StockUser(user);
	}
}

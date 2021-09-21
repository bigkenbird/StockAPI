package com.stockAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.stockAPI.model.User;
import com.stockAPI.repository.UserRepository;

@Service
public class StockUserService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	//載入套件的加密器
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
		
	}
	
	public Integer addUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Integer user_id = userRepository.add(user);
		return user_id;
	}
}

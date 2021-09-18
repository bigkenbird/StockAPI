//package com.stockAPI.service;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.stockAPI.model.StockUser;

//@Service
//public class StockUserDetailsService implements UserDetailsService {
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		StockUser stockUser = (StockUser) User.builder()
//				.username("ken")
//				.password("{noop}ken123")
//				.roles("USER")
//				.build();
//		return stockUser;
//	}
//}

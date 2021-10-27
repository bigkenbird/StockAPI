package com.stockAPI.service.impl;

import java.security.Key;
import java.util.Calendar;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.stockAPI.model.StockUser;
import com.stockAPI.model.User;
import com.stockAPI.service.JWTService;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTServiceImpl implements JWTService {
	
	static Logger logger = LogManager.getLogger();

	@Autowired
	private AuthenticationManager authenticationManager;

	private final String KEY = "StockAPIStockAPIStockAPIStockAPIStockAPIStockAPIStockAPIStockAPIStockAPI";

	public String generateToken(User user) {
		
		// 建立要被驗證的物件
		Authentication authentication = new UsernamePasswordAuthenticationToken(user.getAccount(), user.getPassword());
		authentication = authenticationManager.authenticate(authentication);
		StockUser stockUser = (StockUser) authentication.getPrincipal();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, 20);

		Claims claims = Jwts.claims();
		claims.put("user_id", stockUser.getUser().getId());
		claims.put("account", stockUser.getUsername());
		claims.put("name", stockUser.getUser().getName());
		claims.put("authority", stockUser.getUser().getAuthority());
		claims.setExpiration(calendar.getTime());
		claims.setIssuer("KensStockAPI");

		Key secretKey = Keys.hmacShaKeyFor(KEY.getBytes());
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return Jwts.builder().setClaims(claims).signWith(secretKey).compact();
		
	}
	
	 public Map<String, Object> parseToken(String token) {
			 Key secretKey = Keys.hmacShaKeyFor(KEY.getBytes());

		        JwtParser parser = Jwts.parserBuilder()
		                .setSigningKey(secretKey)
		                .build();
		       
		        	 Claims claims = parser
		 	                .parseClaimsJws(token)
		 	                .getBody();
		        	 return claims.entrySet().stream()
		 	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); 
		 }
}

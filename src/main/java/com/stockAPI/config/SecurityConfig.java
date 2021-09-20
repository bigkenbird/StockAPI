package com.stockAPI.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.stockAPI.service.StockUserDetailsService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	StockUserDetailsService stockUserDetailsService;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
    		.authorizeRequests()
    		.antMatchers("/user/testBlock").authenticated()
    		.antMatchers("/user/testUnblock").permitAll();
        
    }
}

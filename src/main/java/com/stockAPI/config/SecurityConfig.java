package com.stockAPI.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.stockAPI.filter.JWTCheckFilter;
import com.stockAPI.service.StockUserService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	StockUserService stockUserService;
	
	@Autowired
	JWTCheckFilter jWTCheckFilter;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(stockUserService).
		passwordEncoder(new BCryptPasswordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
    		.authorizeRequests()
    		.antMatchers("/user/create").permitAll() //管理員可以新增使用者資料
    		.antMatchers("/user/login").permitAll()
    		.antMatchers("/user/search/**").hasAnyAuthority("ADMIN","NORMAL") //取得用戶資料
    		.antMatchers("/stock/search/**").hasAnyAuthority("ADMIN","NORMAL") //取得股市資料
    		.and()
    		.addFilterBefore(jWTCheckFilter, UsernamePasswordAuthenticationFilter.class)
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    		.and()
    		.csrf().disable()
    		.cors();
        
    }
    
    //加密器註冊容器
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    //驗證類別註冊容器
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}

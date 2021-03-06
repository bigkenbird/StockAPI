package com.stockAPI.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockAPI.model.APIReturnObject;
import com.stockAPI.model.StockUser;
import com.stockAPI.model.User;
import com.stockAPI.service.JWTService;
import com.stockAPI.service.StockUserService;

@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	StockUserService stockUserService;
	
	@Autowired
	JWTService jWTService;
	
	@GetMapping("testBlock")
	public String testBlock() {
		return "testBlock";
	}
	
	
	@GetMapping("testUnblock")
	public String testUnblock() {
		return "testUnblock";
	}
	
	
	@PostMapping("login")
	public APIReturnObject login(@RequestBody User user) {
		APIReturnObject result = new APIReturnObject();
		Map<String, Object> data = new HashMap<String, Object>();
		String token = jWTService.generateToken(user);
		result.setMessage("登入成功，取得token");
		data.put("token", token);
		result.setData(data);
		return result;
	}
	
	@GetMapping("search/{account}")
	public APIReturnObject search(@PathVariable(name="account") String account) {
		APIReturnObject result = new APIReturnObject();
		Map<String, Object> data = new HashMap<String, Object>();
		StockUser  stockUser = stockUserService.getOwnData(account);
		data.put("userData", stockUser.getUser());
		result.setMessage("用戶資料查詢成功");
		result.setData(data);
		return result;
		
	}
	
	@PostMapping("create")
	public APIReturnObject create(@RequestBody User user){
		APIReturnObject result = new APIReturnObject();
		Map<String, Object> data = new HashMap<String, Object>();
		Integer user_id = stockUserService.addUser(user);
		data.put("user_id", user_id);
		result.setMessage("用戶資料新增成功");
		result.setData(data);
		return result;
	}

}

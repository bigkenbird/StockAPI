package com.stockAPI.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockAPI.model.User;

@RestController
@RequestMapping("test")
public class TestController {
	
	@PostMapping("/check")
	public ResponseEntity<String> check(@RequestBody List<User> users){
		
		users.stream().forEach(e -> {
			System.out.println(e);
		});
		
		return new ResponseEntity<String>("接收成功",HttpStatus.OK);
	}

}

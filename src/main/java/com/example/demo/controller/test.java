package com.example.demo.controller;

import java.util.List;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class test {
	
	@ResponseBody
	@PostMapping("/world")
	public String one(String username,String password) {
		if(username==null&&password==null) {
			
			return "用户名密码不能为空";
			
		}else {
			
			if (username.equals("123456")) {
				if (password.equals("123456")) {
					return "登录成功";
				}else {
					return "密码错误";
				}
			}else {
				return"用户名错误";
			}
		}
	}
	
	
	@ResponseBody
	//@RequestMapping("/hello")
	@GetMapping("/hello")
	public String hello(String username,String password) {
		
		if(username==null&&password==null) {
			
			return "用户名密码不能为空";
			
		}else {
			
			if (username.equals("123456")) {
				if (password.equals("123456")) {
					return "登录成功";
				}else {
					return "密码错误";
				}
			}else {
				return"用户名错误";
			}
		}
		
	}

	
	
	
	
	@ResponseBody
	//@RequestMapping("/hello")
	@GetMapping("/helloworld")
	public String helloworld() {
		
		return "hello world !";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

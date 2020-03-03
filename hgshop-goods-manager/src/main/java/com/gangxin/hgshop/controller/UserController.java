package com.gangxin.hgshop.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gangxin.hgshop.service.UserService;

@Controller
public class UserController {

	@Reference(timeout = 2000,version = "1.0.0")
	private UserService userService;
	
	@RequestMapping("toLogin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping("login")
	public String login(String name,String password) {
		
		if(userService.login(name, password)) {
			return "redirect:/";
		}
		
		return "login";
		
	}
}

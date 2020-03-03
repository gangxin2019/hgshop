package com.gangxin.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.gangxin.hgshop.service.UserService;

@Service(interfaceClass = UserService.class,version = "1.0.0")
public class UserServiceImpl implements UserService {

	@Override
	public boolean login(String userName, String passWord) {
		if("admin".equals(userName) && "123456".equals(passWord)) {
			return true;
		}
		return false;
	}

}

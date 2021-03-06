package com.yoonshop.shop.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoonshop.shop.model.User;
import com.yoonshop.shop.repository.UserRepository;

@Service
public class UserSvc {
	@Autowired
	private UserRepository userRep;

	public int userCheck() {
		return userRep.userCheck();
	}
	
	public List<User> userList() {
		return userRep.findAll();
	}
	
	public String userDelete() {
		String resultStr = "";
		
		try {
			int result = userRep.userDelete();
			
			if(result >= 0) {
				resultStr = "success";
			} else {
				resultStr = "fail";
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultStr = "fail";
		}
		
		return resultStr;
	}
}
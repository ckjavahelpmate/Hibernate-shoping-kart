package com.ty.shoping.service;

import com.ty.shoping.dao.UserDao;
import com.ty.shoping.dto.User;

public class UserService {

	UserDao dao = new UserDao() ;
	public User saveUser(User user) {
		
		return dao.saveUser(user);
	
	}
}

package com.ty.shoping.controller;

import com.ty.shoping.dto.User;
import com.ty.shoping.service.UserService;

public class TestSaveUser {

	public static void main(String[] args) {
		User user = new User() ;
		user.setName("rahul");
		user.setCno("8978945786");
		user.setEmail("rahul@mail.com");
		user.setPassword("rahul456");
		
		UserService service = new UserService() ;
		User res = service.saveUser(user) ;
		System.out.println("Inserted data\n"+res);
	}

}

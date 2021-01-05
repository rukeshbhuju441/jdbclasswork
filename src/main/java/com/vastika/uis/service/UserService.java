package com.vastika.uis.service;

import java.util.List;

import com.vastika.uis.model.User;

public interface UserService {

	int saveUserInfo(User user);

	int updateUserInfo(User user);
	
	int deleteUserInfo(int id);

	List<User> getAllUSerInfo();

	User getUserById(int id);
}

package com.tma.service;

import java.util.List;

import org.springframework.social.connect.UserProfile;

import com.tma.db.model.User;

public interface UserService {

	public List<User> getUserById(Integer id);

	public User addUser(User user);
	
	User createFbUser(UserProfile userProfile);

	User getUserByEmail(String email);

}

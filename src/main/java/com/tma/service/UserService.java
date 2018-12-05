package com.tma.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.db.model.User;
import com.tma.entities.daoImpl.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getUserById(Integer id) {
		List<User> users = new ArrayList<>();
		userRepository.findByUserId(id).forEach(users::add);
		return users;
	}

	public User addUser(User user) {
		user = userRepository.save(user);
		return user;
	}

}

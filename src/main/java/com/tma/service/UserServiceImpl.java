package com.tma.service;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.social.connect.UserProfile;
import org.springframework.stereotype.Service;

import com.tma.db.model.User;
import com.tma.entities.daoImpl.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public List<User> getUserById(Integer id) {
		List<User> users = new ArrayList<User>();
		userRepository.findByUserId(id).forEach(users::add);
		return users;
	}

	public User addUser(User user) {
		user = userRepository.save(user);
		return user;
	}

	@Override
	public User createFbUser(UserProfile userProfile) {
		User user = new User();
		user.setFacebookId(userProfile.getId());
		user.setName(userProfile.getFirstName());
		user.setName(userProfile.getEmail());
		user.setRegistrationDate(new Date());
		user.setLastLoginTime(new Date());
		user.setPassword(bCryptPasswordEncoder.encode(randomAlphabetic(8)));
		user = userRepository.save(user);
		return user;
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByName(email);
	}

}

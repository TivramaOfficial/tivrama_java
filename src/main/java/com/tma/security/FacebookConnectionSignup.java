package com.tma.security;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;
import org.springframework.stereotype.Service;

import com.tma.db.model.User;
import com.tma.entities.daoImpl.UserRepository;
import com.tma.service.UserService;


@Service
public class FacebookConnectionSignup implements ConnectionSignUp {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Override
	public String execute(Connection<?> connection) {
		System.out.println("Fb SignUp === ");
		UserProfile userProfile = connection.fetchUserProfile();
		User user = userService.getUserByEmail(userProfile.getEmail());
		if (user == null) {
			user = userService.createFbUser(userProfile);
		} else {
			user.setLastLoginTime(new Date());
			userRepository.save(user);
		}
		SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(
				userProfile.getEmail(), null, Arrays.asList(new SimpleGrantedAuthority("FACEBOOK_USER"))));
		return user.getName();
	}

}

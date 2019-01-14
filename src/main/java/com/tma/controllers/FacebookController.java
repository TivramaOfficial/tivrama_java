package com.tma.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/userLogin" })
public class FacebookController {

	@RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
	public String welcome() {

		return "welcome";
	}

	@RequestMapping(value = { "/detail" }, method = RequestMethod.GET)
	public String getLoggedInUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth.getName()+",\n"+auth.getCredentials();
	}
	
}

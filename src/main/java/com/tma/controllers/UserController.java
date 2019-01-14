package com.tma.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.api.ApiResponse;
import com.tma.db.model.User;
import com.tma.json.model.JsonUser;
import com.tma.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GET
	@RequestMapping(value = "/locality/getUser/{id}")
	public ApiResponse<List<User>> getUserById(@PathVariable Integer id) {
		List<User> u = userService.getUserById(id);
		return new ApiResponse<List<User>>(u);
	}

	@POST
	@RequestMapping(value = "/user/addUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ApiResponse<JsonUser> addUser(@RequestBody User user) {
		User u = userService.addUser(user);
		JsonUser jsonUser = new JsonUser();
		BeanUtils.copyProperties(u, jsonUser);
		return new ApiResponse<JsonUser>(jsonUser);
	}

}

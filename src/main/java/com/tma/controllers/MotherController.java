package com.tma.controllers;

import java.util.List;
import java.util.Map;

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
import com.tma.db.model.Mother;
import com.tma.json.model.JsonMother;
import com.tma.json.model.JsonUser;
import com.tma.service.MotherService;

@RestController
public class MotherController {

	@Autowired
	private MotherService motherService;
	
	@GET
	@RequestMapping(value="/locality/getMother/{id}")
	public ApiResponse<List<Mother>> getMotherById(@PathVariable Integer id){
		List<Mother> mother = motherService.getMotherById(id);
		return new ApiResponse<List<Mother>>(mother);
	} 
	
	@GET
	@RequestMapping(value="/locality/getMother/all")
	public ApiResponse<List<Mother>> getAllMothers(){
		List<Mother> mother = motherService.getAllMothers();
		return new ApiResponse<List<Mother>>(mother);
	} 
	
	@GET
	@RequestMapping(value="/mother/{id}/getContact")
	public ApiResponse<Map<String,String>> getMothersContact(@PathVariable Integer id){
		Map<String,String> motherMap = motherService.getMothersContact(id);
		return new ApiResponse<Map<String,String>>(motherMap);
	}
	
	@POST
	@RequestMapping(value="/mother/addMother")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ApiResponse<JsonMother> addMother(@RequestBody Mother mother) {
		Mother m = motherService.addMother(mother);
		JsonMother jsonMother = new JsonMother();
		BeanUtils.copyProperties(m, jsonMother);
		return new ApiResponse<JsonMother>(jsonMother);
	}
	
}

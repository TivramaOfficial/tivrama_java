package com.tma.controllers;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.api.ApiResponse;
import com.tma.db.model.MotherMenu;
import com.tma.service.MotherMenuService;

@RestController
public class MotherMenuController {
	
	@Autowired
	private MotherMenuService motherMenuService;
	
	@GET
	@RequestMapping(value="/locality/getMenu/{id}")
	public ApiResponse<List<MotherMenu>> getMenuByMotherId(@PathVariable Integer id){
		List<MotherMenu> menu = motherMenuService.getMenuByMotherId(id);
		return new ApiResponse<List<MotherMenu>>(menu);
	} 
	
	@GET
	@RequestMapping(value="/mother/{id}/getTodaysMenu")
	public ApiResponse<List<MotherMenu>> getTodaysMenuByMotherId(@PathVariable Integer id){
		List<MotherMenu> menu = motherMenuService.getMenuByMotherId(id);
		return new ApiResponse<List<MotherMenu>>(menu);
	} 
}

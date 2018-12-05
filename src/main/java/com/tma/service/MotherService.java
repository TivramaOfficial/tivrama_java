package com.tma.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.db.model.Mother;
import com.tma.entities.daoImpl.MotherRepository;

@Service
public class MotherService {

	@Autowired
	private MotherRepository motherRepository;
	
	private static SessionFactory sessionFactory;
	
	public List<Mother>  getMotherById(Integer id){
		List<Mother>  mothers = new ArrayList<>();
		motherRepository.findByMotherId(id).forEach(mothers::add);
		return mothers;
	}
	
	public List<Mother>  getAllMothers(){
		List<Mother>  mothers = new ArrayList<>();
		motherRepository.findAll().forEach(mothers::add);
		return mothers;
	}
	
	public Map<String,String>  getMothersContact(Integer id){
		Map<String,String> map = new HashMap<String,String>();
		List<Mother>  mothers = new ArrayList<>();
		motherRepository.findByMotherId(id).forEach(mothers::add);
		for(Mother mother:mothers) {
			map.put("name",mother.getName());
			map.put("mobile",mother.getMobile());
			map.put("address",mother.getAddress());
		}
		return map;
	}
	
	public Mother addMother(Mother mother) {
		mother = motherRepository.save(mother);
		return mother;
	}
}

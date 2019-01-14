package com.tma.entities.daoImpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tma.db.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public List<User> findByUserId(Integer id);
	
	User findByName(String name);
}

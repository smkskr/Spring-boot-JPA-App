package com.example.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entity.User;
import com.example.app.repository.UserRepository;

@Service
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private UserRepository userRepository; 
	
	public User saveUser(User user) {
		//entityManager.persist(user);
		return userRepository.save(user);
		
	}
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
}

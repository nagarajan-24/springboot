package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;
	@Autowired
	PasswordEncoder pwdencoder;

	public void addUserDetails(com.example.demo.Model.User user) {
		user.setPassword(pwdencoder.encode(user.getPassword()));
		repo.save(user);
		
	}
	
	
}

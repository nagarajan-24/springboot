package com.example.demo.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

@RestController
public class UserControler {
	@Autowired
	UserService uservice;
	@PostMapping("/user")
	public void addUserDeatails(@RequestBody User user) {
		uservice.addUserDetails(user);
	}
}

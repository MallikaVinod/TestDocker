package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginModel;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
	@Autowired
	LoginService loginService;
	@GetMapping("/showusers")
public List<LoginModel> getllUsers()
{
	return loginService.getAllUsers();
		
}
}

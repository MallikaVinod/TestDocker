package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoginModel;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{
@Autowired
LoginRepository loginRepo;
	@Override
	public List<LoginModel> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<LoginModel>) loginRepo.findAll();
	}

}

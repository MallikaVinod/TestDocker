package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LoginModel;
@Repository
public interface LoginRepository extends CrudRepository<LoginModel, Long> {

}

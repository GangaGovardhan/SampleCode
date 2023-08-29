package com.full.stack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.full.stack.model.EmpData;
import com.full.stack.repo.Dao;

@RestController
@RequestMapping("/employeedata")
public class Api {
  
	
	@Autowired
	private Dao dao;
	
	
	@GetMapping
	public List<EmpData> getAllEmployees(){
		return dao.findAll();
	}
}

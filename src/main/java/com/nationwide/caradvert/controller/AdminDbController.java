package com.nationwide.caradvert.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.caradvert.entity.admin_details;
import com.nationwide.caradvert.repository.AdminRepo;


@RestController
public class AdminDbController {

	@Autowired
	private AdminRepo repo;
	
	@GetMapping("/showAll")
	public ArrayList<admin_details> showall(){
		return repo.findAll();
	}
}

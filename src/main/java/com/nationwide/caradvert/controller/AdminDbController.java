package com.nationwide.caradvert.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.caradvert.entity.admin_details;
import com.nationwide.caradvert.repository.AdminRepo;


@RestController
public class AdminDbController {

	@Autowired
	private AdminRepo repo;
	
	@GetMapping("/showAdminDetails")
	public ArrayList<admin_details> showall(){
		return repo.findAll();
	}
	
	@PostMapping("/saveAdminDetails")
	public String saveData(@RequestBody admin_details ref){
		repo.save(ref);
		return "saved";
	}
}

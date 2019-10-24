package com.nationwide.caradvert.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.caradvert.entity.car_seller_details;
import com.nationwide.caradvert.repository.CarSellerRepo;

@RestController
public class CarSellerDbController {
	
	@Autowired
	private CarSellerRepo repo;

	@GetMapping("/showCarSellerDetails")
	public ArrayList<car_seller_details> showall(){
		return repo.findAll();
	}
	
	@PostMapping("/saveCarSellerDetails")
	public String saveData(@RequestBody car_seller_details ref){
		repo.save(ref);
		return "saved";
	}
}

package com.nationwide.caradvert.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.caradvert.entity.car_seller_details;
import com.nationwide.caradvert.service.CarSellerService;

@RestController
@RequestMapping("/CarSeller")
public class CarSellerController {
	
	@Autowired
	private CarSellerService logic;
	
	@GetMapping("/showCarSellerDetails")
	public ArrayList<car_seller_details> showall(){
		return logic.showCarSellerDetails();
	}
	
	@PostMapping("/saveCarSellerDetails")
	public String saveData(@RequestBody car_seller_details ref){
		logic.saveCarSellerDetails(ref);
		return "saved";
	}
}

package com.nationwide.caradvert.controller;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.caradvert.entity.car_seller_details;
import com.nationwide.caradvert.service.CarSellerService;

@RestController
@Transactional
@CrossOrigin("*")
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
	
	@DeleteMapping("/deleteCarSeller/{username}")
	public String deleteCarSeller(@PathVariable String username) {
		logic.deleteCarSeller(username);
		return "Car seller deleted";
	}
	
	@PutMapping("/updateCarSellerDetails")
	public String updateData(@RequestBody car_seller_details ref){
		logic.updateCarSellerDetails(ref);
		return "Car seller details updated";
	}
}

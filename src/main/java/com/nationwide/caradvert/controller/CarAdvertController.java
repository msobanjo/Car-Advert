package com.nationwide.caradvert.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.caradvert.entity.car_advert;
import com.nationwide.caradvert.service.CarAdvertService;

@RestController
@RequestMapping("/CarAdvert")
public class CarAdvertController {
	
	@Autowired
	private CarAdvertService logic;
	
	@GetMapping("/showCarAdvertDetails")
	public ArrayList<car_advert> showall(){
		return logic.showCarAdvertDetails();
	}
	
	@PostMapping("/saveCarAdvertDetails")
	public String saveData(@RequestBody car_advert ref){
		logic.saveCarADvertDetails(ref);
		return "saved";
	}

}

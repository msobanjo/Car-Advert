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

import com.nationwide.caradvert.entity.car_advert;
import com.nationwide.caradvert.service.CarAdvertService;

@RestController
@Transactional
@CrossOrigin("*")
@RequestMapping("/CarAdvert")
public class CarAdvertController {

	@Autowired
	private CarAdvertService logic;

	@GetMapping("/showCarAdvertDetails")
	public ArrayList<car_advert> showall() {
		return logic.showCarAdvertDetails();
	}

	@PostMapping("/saveCarAdvertDetails")
	public String saveData(@RequestBody car_advert ref) {
		logic.saveCarADvertDetails(ref);
		return "saved";
	}

	@DeleteMapping("/deleteCarAdvert/{advertId}")
	public String deleteCarAdvert(@PathVariable int advertId) {
		logic.deleteCarAdvert(advertId);
		return "Car advert deleted";
	}

	@PutMapping("/updateCarAdvert")
	public String updateData(@RequestBody car_advert ref) {
		logic.updateCarAdvert(ref);
		return "Car Advert updated";
	}

}

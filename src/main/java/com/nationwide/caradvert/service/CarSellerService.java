package com.nationwide.caradvert.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.caradvert.entity.car_seller_details;
import com.nationwide.caradvert.repository.CarSellerRepo;

@Service
public class CarSellerService {
	
	@Autowired
	private CarSellerRepo repo;
	
	public ArrayList<car_seller_details> showCarSellerDetails(){
		return repo.findAll();
	}
	
	public void saveCarSellerDetails(car_seller_details ref){
		repo.save(ref);
	}
}

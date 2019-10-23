package com.nationwide.caradvert.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.caradvert.entity.car_advert;
import com.nationwide.caradvert.repository.CarAdvertRepo;

@Service
public class CarAdvertService {

	@Autowired
	private CarAdvertRepo repo;
	
	public ArrayList<car_advert> showCarAdvertDetails(){
		return repo.findAll();
	}
	
	public void saveCarADvertDetails(car_advert ref){
		repo.save(ref);
	}
	
	public void deleteCarAdvert(int advertId) {
		repo.deleteByAdvertid(advertId);
	}
}

package com.nationwide.caradvert.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nationwide.caradvert.entity.car_advert;



@Repository
public interface CarAdvertRepo extends JpaRepository<car_advert, Integer> {
	
	public ArrayList<car_advert> findAll();
	
	public void deleteByAdvertid(int advetId);
}

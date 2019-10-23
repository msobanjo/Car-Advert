package com.nationwide.caradvert.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nationwide.caradvert.entity.car_seller_details;

public interface CarSellerRepo extends JpaRepository<car_seller_details, Integer>  {
	
	
	public ArrayList<car_seller_details> findAll();
	
	public void deleteByUsername(String username);
}

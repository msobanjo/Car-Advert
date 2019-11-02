package com.nationwide.caradvert.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nationwide.caradvert.entity.admin_details;


public interface AdminRepo extends JpaRepository<admin_details, Integer>  {

	public ArrayList<admin_details> findAll();
	
	public ArrayList<String> findMaxPhoneNumber();
	
	public ArrayList<String> findUsername(String firstName);
	
	public void deleteByUsername(String username);
	
}

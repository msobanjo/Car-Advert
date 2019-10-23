package com.nationwide.caradvert.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.caradvert.entity.admin_details;
import com.nationwide.caradvert.repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo repo;
	
	public ArrayList<String> findMaxNum() {
		return repo.findMaxPhoneNumber();
	}
	
	public ArrayList<admin_details> showAdminDetails(){
		return repo.findAll();
	}
	
	public void saveAdminDetails(admin_details ref){
		repo.save(ref);
	}
	
	public ArrayList<String> showUsername(String firstName){
		return repo.findUsername(firstName);
	}
	
	public void deleteAdmin(String username) {
		repo.deleteByUsername(username);
	}
	
	public void updateAdminDetails(admin_details ref){
		repo.save(ref);
	}
	
}

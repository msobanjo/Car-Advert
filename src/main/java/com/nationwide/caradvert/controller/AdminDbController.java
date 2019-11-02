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

import com.nationwide.caradvert.entity.admin_details;
import com.nationwide.caradvert.service.AdminService;


@RestController
@Transactional
@CrossOrigin("*")
@RequestMapping("/Admin")
public class AdminDbController {

	
	@Autowired
	private AdminService logic;
	
	@GetMapping("/showAdminDetails")
	public ArrayList<admin_details> showall(){
		return logic.showAdminDetails();
	}
	
	@GetMapping("/showMax")
	public ArrayList<String> showMax(){
		return logic.findMaxNum();
	}
	
	@PostMapping("/saveAdminDetails")
	public String saveData(@RequestBody admin_details ref){
		logic.saveAdminDetails(ref);
		return "saved";
	}
	
	@GetMapping("/showUsername/{firstName}")
	public ArrayList<String> showUsername(@PathVariable String firstName){
		return logic.showUsername(firstName);
	}
	
	@DeleteMapping("/deleteAdmin/{username}")
	public String deleteAdmin(@PathVariable String username) {
		logic.deleteAdmin(username);
		return "Admin deleted";
	}
	
	@PutMapping("/updateAdminDetails")
	public String updateData(@RequestBody admin_details ref){
		logic.updateAdminDetails(ref);
		return "Admin details updated";
	}
}

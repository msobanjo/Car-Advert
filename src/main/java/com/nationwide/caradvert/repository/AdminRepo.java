package com.nationwide.caradvert.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nationwide.caradvert.entity.admin_details;


public interface AdminRepo extends JpaRepository<admin_details, Integer>  {

	public ArrayList<admin_details> findAll();
	
	public ArrayList<String> findMaxPhoneNumber();
	
	public ArrayList<String> findUsername(String firstName);
	/*
    @Query("UPDATE admin_details SET emailaddress = " + "'" + "testtest" + "' " + "  WHERE = ")
   public int updateAddress(@Param("companyId") int companyId, @Param("address") String address);
   */
}

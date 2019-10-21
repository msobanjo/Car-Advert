package com.nationwide.caradvert.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

//@Table(name = "admin_details")
@NamedQueries(value= {
		@NamedQuery(name = "admin_details.findMaxPhoneNumber",
					query = "select p.firstname from admin_details p"
				),
		@NamedQuery(name = "admin_details.findUsername",
					query = "select p.username from admin_details p where firstname = ?1"
		)
})

public class admin_details {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;
	private String emailaddress;
	private String firstname;
	private String lastname;
	private String pswd;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	
}

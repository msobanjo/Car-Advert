package com.nationwide.caradvert.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class car_advert {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int advertid;
	private String username;
	private String image;
	private String advertdescription;
	private int price;
	private String make;
	private String model;
	private String modelvariant;
	private String modelyear;
	private int mileage;
	private String colour;
	private String enginesize;
	private String gearbox;
	private String doors;
	private String adverttitle;
	
	public int getAdvertid() {
		return advertid;
	}
	public void setAdvertid(int advertid) {
		this.advertid = advertid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAdvertdescription() {
		return advertdescription;
	}
	public void setAdvertdescription(String advertdescription) {
		this.advertdescription = advertdescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModelvariant() {
		return modelvariant;
	}
	public void setModelvariant(String modelvariant) {
		this.modelvariant = modelvariant;
	}
	public String getModelyear() {
		return modelyear;
	}
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getEnginesize() {
		return enginesize;
	}
	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}
	public String getGearbox() {
		return gearbox;
	}
	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getAdverttitle() {
		return adverttitle;
	}
	public void setAdverttitle(String adverttitle) {
		this.adverttitle = adverttitle;
	}
}

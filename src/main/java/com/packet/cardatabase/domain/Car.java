package com.packet.cardatabase.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String brand;
	private String model;
	private String color;
	private String registerNumber;
	private int year;
	private double price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	private Owner owner;
	
	public Car() {
		
	}
	public Car(String brand, String model, String color, String registerNumber, int year, double price, Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
		this.owner = owner;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Owner getOwner() {
		return owner;
		}
		public void setOwner(Owner owner) {
		this.owner = owner;
		}
	// Many to many	
		/*
		 * @ManyToMany(mappedBy = "cars") private Set<Owner> owners; public Set<Owner>
		 * getOwners() { return owners; } public void setOwners(Set<Owner> owners) {
		 * this.owners = owners; }
		 */
}

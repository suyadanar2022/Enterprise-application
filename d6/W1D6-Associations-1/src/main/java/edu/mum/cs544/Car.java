package edu.mum.cs544;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String year;
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	public Car() {
	}

	public Car(String brand, String year, double price) {
		this.brand = brand;
		this.year = year;
		this.price = price;
	}

	
	public Car(String brand, String year, double price,Owner owner) {
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.owner = owner;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	

}

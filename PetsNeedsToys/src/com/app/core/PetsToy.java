package com.app.core;

import java.time.LocalDate;

import enums.Brand;
import enums.Material;

public class PetsToy {

	
	private static int idCounter=0;
	private int id;
	private String name;
	private Brand brand;
	private String[]target_species;
	private Material material;
	private int stock;


	private LocalDate stockListingDate;
	private LocalDate stockUpdateDate;
	private double price;
	private double discount;
	public PetsToy(String name, Brand brand, String[] target_species, Material material, int stock,
			LocalDate stockListingDate, double price) {
		super();
		this.id = ++idCounter;
		this.name = name;
		this.brand = brand;
		this.target_species = target_species;
		this.material = material;
		this.stock = stock;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.stockUpdateDate = stockListingDate;
		this.discount = 0.0;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String[] getTarget_species() {
		return target_species;
	}
	public void setTarget_species(String[] target_species) {
		this.target_species = target_species;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getStockListingDate() {
		return stockListingDate;
	}
	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
		this.setPrice((discount/100)*price);
	}

}

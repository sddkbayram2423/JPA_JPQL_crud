package com.proje.model;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	
	private String productName;
	
	private double unitPrice;
	
	private int avaible;
	
	@ManyToOne
	@JoinColumn(name="brandID")
	private Brand brand;
	
	@ManyToOne
	@JoinColumn(name="categoryID")
	private Category category;

	public Product() {}

	public Product(String productName, double unitPrice, int avaible, Brand brand, Category category) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.avaible = avaible;
		this.brand = brand;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAvaible() {
		return avaible;
	}

	public void setAvaible(int avaible) {
		this.avaible = avaible;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice
				+ ", avaible=" + avaible + ", brand=" + brand + ", category=" + category + "]";
	}
	
	

}

package com.ArtSuppliesStore.ArtSuppliesStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyArts")
public class MyArtList {
	
	@Id
	private int id;
	private String name; 
	private String seller;
	private String price;
	public MyArtList(int id, String name, String seller, String price) {
		super();
		this.id = id;
		this.name = name;
		this.seller = seller;
		this.price = price;
	}
	public MyArtList() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}

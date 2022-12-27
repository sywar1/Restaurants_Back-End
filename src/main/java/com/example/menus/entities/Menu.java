package com.example.menus.entities;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMenu;
	private String nomMenu;
	private Double prixMenu;
	
	
	@ManyToOne
	private Restaurant restaurant; 
	
	public Menu() {
		
	}

	public Menu(String nomMenu, Double prixMenu) {
		super();
		this.nomMenu = nomMenu;
		this.prixMenu = prixMenu;
	}

	public Long getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}

	public String getNomMenu() {
		return nomMenu;
	}

	public void setNomMenu(String nomMenu) {
		this.nomMenu = nomMenu;
	}

	public Double getPrixMenu() {
		return prixMenu;
	}

	public void setPrixMenu(Double prixMenu) {
		this.prixMenu = prixMenu;
	}

	
	
	@Override
	public String toString() {
		return "Menu [idMenu=" + idMenu + ", nomMenu=" + nomMenu + ", prixMenu=" + prixMenu + "]";
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}

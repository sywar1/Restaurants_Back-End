package com.example.menus.service;

import java.util.List;


import com.example.menus.entities.Menu;
import com.example.menus.entities.Restaurant;

public interface MenuService {
	
	Menu saveMenu(Menu m);
	Menu updateMenu(Menu m);
	void deleteMenu(Menu m);
	void deleteMenuById(Long id);
	Menu getMenu(Long id);
	
	List<Menu>getAllMenus();
	
	List<Menu>findByNomMenu(String nom);
	List<Menu>findByNomMenuContains(String nom);
	List<Menu>findByNomPrix(String nom, Double prix);
	List<Menu>findByRestaurant(Restaurant restaurant);
	List<Menu>findByRestaurantIdRest(Long id);
	List<Menu>findByOrderByNomMenuAsc();
	List<Menu>trierMenusNomsPrix();



}

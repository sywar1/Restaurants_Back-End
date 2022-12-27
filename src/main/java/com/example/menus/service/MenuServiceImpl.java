package com.example.menus.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.menus.entities.Menu;
import com.example.menus.entities.Restaurant;
import com.example.menus.repos.MenuRepository;

@Service
public  class MenuServiceImpl implements MenuService{

	@Autowired
	MenuRepository menuRepository;

	
	
	@Override
	public Menu saveMenu(Menu m) {
		return menuRepository.save(m);

	}

	@Override
	public Menu updateMenu(Menu m) {
		return menuRepository.save(m);
	
	}

	@Override
	public void deleteMenu(Menu m) {
		menuRepository.delete(m);
		
	}

	@Override
	public void deleteMenuById(Long id) {
		menuRepository.deleteById(id);
		
	}

	@Override
	public Menu getMenu(Long id) {
		return menuRepository.findById(id).get();
	}

	
	@Override
	public List<Menu> getAllMenus() {
	      return menuRepository.findAll();

	  }
	

	@Override
	public List<Menu> findByNomMenu(String nom) {
		return menuRepository.findByNomMenu(nom);
	}

	@Override
	public List<Menu> findByNomMenuContains(String nom) {
		return menuRepository.findByNomMenuContains(nom);
		
	}

	@Override
	public List<Menu> findByNomPrix(String nom, Double prix) {
		return menuRepository.findByNomPrix(nom, prix);

	}

	@Override
	public List<Menu> findByRestaurant(Restaurant restaurant) {
		return menuRepository.findByRestaurant(restaurant);
	}

	@Override
	public List<Menu> findByRestaurantIdRest(Long id) {
		return menuRepository.findByRestaurantIdRest(id);
	}

	@Override
	public List<Menu> findByOrderByNomMenuAsc() {
		return menuRepository.findByOrderByNomMenuAsc();
	}

	@Override
	public List<Menu> trierMenusNomsPrix() {
		return menuRepository.trierMenusNomsPrix();
	}

	

	

}

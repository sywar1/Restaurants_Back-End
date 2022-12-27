package com.example.menus.restcontrollers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.menus.entities.Menu;
import com.example.menus.service.MenuService;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MenuRESTController {
	
	@Autowired
	MenuService menuService;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	List<Menu> getAllMenus() {
		
	      return menuService.getAllMenus();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Menu getMenuById(@PathVariable("id") Long id) {
	return menuService.getMenu(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Menu createMenu(@RequestBody Menu menu) {
	return menuService.saveMenu(menu);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Menu updateMenu(@RequestBody Menu menu) {
	return menuService.updateMenu(menu);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteMenu(@PathVariable("id") Long id)
	{
	menuService.deleteMenuById(id);
	}
	
	@RequestMapping(value="/prodscast/{idRest}",method = RequestMethod.GET)
	public List<Menu> getMenusByRestId(@PathVariable("idRest") Long idRest) {
	return menuService.findByRestaurantIdRest(idRest);
	}
	
	@RequestMapping(value="/prodsByName/{nom}",method = RequestMethod.GET)
	public List<Menu> findByNomMenuContains(@PathVariable("nom") String nom) {
	return menuService.findByNomMenuContains(nom);
	}




}

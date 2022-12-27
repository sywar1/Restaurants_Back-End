package com.example.menus;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.menus.entities.Menu;
import com.example.menus.entities.Restaurant;
import com.example.menus.repos.MenuRepository;

@SpringBootTest
class MenusApplicationTests2 {

	@Autowired
	private MenuRepository menuRepository;
	@Test
	public void testCreateMenu() {
	Menu menuu = new Menu("Jus",4.500);
	menuRepository.save(menuu);
	}
	@Test
	public void testFindMenu()
	{
	Menu m = menuRepository.findById(3L).get(); 
	System.out.println(m);
	}
	@Test
	public void testUpdateMenu()
	{
	Menu m = menuRepository.findById(3L).get();
	m.setPrixMenu(6500.0);
	menuRepository.save(m);
	}
	@Test
	public void testDeleteMenu()
	{
	menuRepository.deleteById(3L);;
	}
	 
	@Test
	public void testListerTousMenus()
	{
	List<Menu> menuu = menuRepository.findAll();
	for (Menu m : menuu)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testFindByNomMenu()
	{
	List<Menu> menuu = menuRepository.findByNomMenu("Makloub");
	for (Menu m : menuu)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testFindByNomMenuContains ()
	{
	List<Menu> menuu=menuRepository.findByNomMenuContains("Makloub");
	for (Menu m : menuu)
	{
	System.out.println(m);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Menu> menuu = menuRepository.findByNomPrix("Makloub", 8500.0);
	for (Menu m : menuu)
	{
	System.out.println(m);
	}
	}
	
	@Test
	public void testfindByRestaurant()
	{
	Restaurant rest = new Restaurant();
	rest.setIdRest(1L);
	List<Menu> menuu = menuRepository.findByRestaurant(rest);
	for (Menu m : menuu)
	{
	System.out.println(m);
	}}
	@Test
	public void findByRestaurantIdRest()
	{
	List<Menu> menuu = menuRepository.findByRestaurantIdRest(1L);
	for (Menu m : menuu)
	{
	System.out.println(m);
	}
	 }
	@Test
	public void testfindByOrderByNomMenuAsc()
	{
	List<Menu> menuu = menuRepository.findByOrderByNomMenuAsc();
	for (Menu m : menuu)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testTrierMenusNomsPrix()
	{
	List<Menu> menuu = menuRepository.trierMenusNomsPrix();
	for (Menu m : menuu)
	{
	System.out.println(m);
	}
	}



	}

package com.example.menus.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.menus.entities.Menu;
import com.example.menus.entities.Restaurant;


@RepositoryRestResource(path = "rest")
public interface MenuRepository extends JpaRepository <Menu, Long> {
	List<Menu> findByNomMenu(String nom);
	 List<Menu> findByNomMenuContains(String nom); 
	 
	 @Query("select m from Menu m where m.nomMenu like %:nom and m.prixMenu > :prix")
	 List<Menu> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	 
	 @Query("select m from Menu m where m.restaurant = ?1")
	 List<Menu> findByRestaurant (Restaurant restaurant);
	 
	 List<Menu> findByRestaurantIdRest(Long id);
	 
	 List<Menu> findByOrderByNomMenuAsc();
	 
	 @Query("select m from Menu m order by m.nomMenu ASC, m.prixMenu DESC")
	 List<Menu> trierMenusNomsPrix ();





}

package com.example.menus.entities;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomMenu", types = { Menu.class })
public interface MenuProjection {
	
	public String getNomMenu();
	
	
}

package com.example.menus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.menus.entities.Menu;
import com.example.menus.entities.Restaurant;

@SpringBootApplication
public class MenusApplication implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;


	public static void main(String[] args)   {
		SpringApplication.run(MenusApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Menu.class,Restaurant.class);

	
	}
	

}



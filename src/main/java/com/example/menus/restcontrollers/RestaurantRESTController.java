package com.example.menus.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.menus.entities.Restaurant;
import com.example.menus.repos.RestaurantRepository;

@RestController
@RequestMapping("/api/rest")
@CrossOrigin("*")
public class RestaurantRESTController {
	@Autowired
	RestaurantRepository restaurantRepository;
	@RequestMapping(method=RequestMethod.GET)
	
	public List<Restaurant> getAllRestaurants()
	{
	return restaurantRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Restaurant getRestaurantById(@PathVariable("id") Long id) {
	return restaurantRepository.findById(id).get();
	}

}

package com.abilash.udemy.loacation.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abilash.udemy.loacation.api.entity.Location;
import com.abilash.udemy.loacation.api.service.LocationService;

@CrossOrigin(origins ="http://localhost:3000")
@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping(value="/locations", method=RequestMethod.POST)
	@ResponseBody
	public Location addLocation(@RequestBody Location location) {
		return locationService.addLocation(location);
	}
	
	@RequestMapping(value="/locations", method=RequestMethod.GET)
	@ResponseBody
	public List<Location> listLocations() {
		return locationService.listLocations();
	}
	
	@RequestMapping(value="/locations/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteLocation(@PathVariable int id) {
		locationService.deleteLocation(id);
	}
	
	@RequestMapping(value="/locations/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Location updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);
	}
	
}

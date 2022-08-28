package com.abilash.udemy.loacation.api.service;

import java.util.List;

import com.abilash.udemy.loacation.api.entity.Location;

public interface LocationService {
	
	Location addLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(int id);
	Location getLocation(int id);
	List<Location> listLocations();
	
}

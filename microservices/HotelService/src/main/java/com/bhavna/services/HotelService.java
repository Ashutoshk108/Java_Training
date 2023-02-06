package com.bhavna.services;

import java.util.List;

import com.bhavna.entity.Hotel;

public interface HotelService {
	
	//create
	Hotel create(Hotel hotel);
	
	//getAll
	List<Hotel> getAll();
	
	//get single
	Hotel get(String id);

}

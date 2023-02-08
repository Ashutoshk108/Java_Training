package com.bhavna.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bhavna.entities.Hotel;
import com.bhavna.entities.Rating;
import com.bhavna.entities.User;
import com.bhavna.exceptions.ResourceNotFoundException;
import com.bhavna.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId=UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id not found on server!!: "+userId));
		//fetch rating of the above user from rating service
		//http://localhost:8083/ratings/users/f9fbecfc-e903-4dfb-b7fe-652d61efcf95
		
		Rating[] ratingsOfUser = restTemplate.getForObject("http://RATING-SERVICE/ratings/users/"+user.getUserId(), Rating[].class);
		logger.info("{}", ratingsOfUser);
		List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();
		
		List<Rating> ratingList=ratings.stream().map(rating->{
			System.out.println(rating.getHotelId());
			ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
			Hotel hotel = forEntity.getBody();
			
			logger.info("response status code: {}",forEntity.getStatusCode());
			
			rating.setHotel(hotel);
			return rating;
		}).collect(Collectors.toList());
		
		
		user.setRatings(ratingList);
		
		return user;
	}

	@Override
	public String deleteUser(String userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		return "data deleted";
	}

	@Override
	public User updateUser(String userId, User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		return null;
	}
	
}

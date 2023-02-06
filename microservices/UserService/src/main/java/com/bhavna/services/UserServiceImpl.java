package com.bhavna.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.entities.User;
import com.bhavna.exceptions.ResourceNotFoundException;
import com.bhavna.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

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
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id not found on server!!: "+userId));
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

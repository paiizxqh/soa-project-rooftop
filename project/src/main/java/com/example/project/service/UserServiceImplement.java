package com.example.project.service;

import org.springframework.stereotype.Service;

import com.example.project.dto.UserDTO;
import com.example.project.entity.User;
import com.example.project.repositories.UserRepository;

@Service
public class UserServiceImplement implements UserService{

	
	private UserRepository userRepository;
	
	public UserServiceImplement(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public User save(UserDTO userDTO) {
		User user = new User(userDTO.getName(),userDTO.getUsername(),userDTO.getPassword());
		return userRepository.save(user);
	}
}
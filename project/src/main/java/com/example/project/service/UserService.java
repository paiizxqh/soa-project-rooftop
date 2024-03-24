package com.example.project.service;

import org.springframework.stereotype.Service;

import com.example.project.dto.UserDTO;
import com.example.project.entity.User;

@Service
public interface UserService {
	User findByUsername(String username);
	User save(UserDTO userDTO);
}

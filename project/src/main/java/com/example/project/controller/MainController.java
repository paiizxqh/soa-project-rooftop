package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.project.dto.UserDTO;
import com.example.project.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(){
	    return "index";
	}
	
	@GetMapping("/login")
	public String Login(Model model, UserDTO userDTO) {
		model.addAttribute("user",userDTO);
		return "login";
	}
	
	@GetMapping("/register")
	public String Register(Model model, UserDTO userDTO) {
		model.addAttribute("user",userDTO);
		return "register";
	}
	
	@PostMapping("/register")
    public String registerSave(@ModelAttribute("user") UserDTO userDTO) {
        if (userService != null) {
            userService.save(userDTO);
            return "register";
        } else {
            // Handle the case where userService is null
            return "error";
        }
    }
}

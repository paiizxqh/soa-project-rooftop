package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.example.project.entity.Person;

@Controller
public class MainController {
	@GetMapping("/")
	public String Main(Model model){
	    String hello = "Hello";
	    Person person = new Person();
	    person.setFirstName("Pattarachai");
	    person.setLastName("Daovijitr");
	    model.addAttribute("hello",hello);
	    model.addAttribute("person",person);
	    return "index";
	}
	
	@GetMapping("/login")
	public String Login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String Register() {
		return "register";
	}
}

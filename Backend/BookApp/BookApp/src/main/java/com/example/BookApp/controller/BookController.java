package com.example.BookApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookApp.model.User;
import com.example.BookApp.service.UserService;


@RestController
public class BookController {
	
	@Autowired
	private UserService userService;
	
	 @GetMapping("/")
	    public String greet() {
	        return "Welcome to Book app";
	    }
	 
	 	@PostMapping("/registerUser")
	    @ResponseBody
	    public User addUser(@RequestBody User user) {
	        User user1 = userService.addUser(user);
	        return user1;
	    }
	 	
	 	@PutMapping("/user")
	    public ResponseEntity<User> updateUser(@RequestBody User user) {
	        return userService.updateUser(user);
	    }

	    @GetMapping("/getOneUser/{id}")
	    public User getOneUser(@PathVariable int id) {
	        return userService.getOneUser(id);
	    }

	    @DeleteMapping("/user/{id}")
	    public String delete(@PathVariable int id) {
	        return userService.deleteUser(id);

	    }
}

package com.legatohealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legatohealth.beans.Custom;
import com.legatohealth.beans.User;
import com.legatohealth.exceptions.UserNotFoundException;
import com.legatohealth.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRest {
	@Autowired
	private UserService service;
	/* storing the user object coming from the request body, consumes convert to the json formate to the user,@RequestBody extracts
	 * user from the request and suplies the converted user object tothe parameter
	 * but the user json must have name password and age
	  */
	@PostMapping(path="/user",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		ResponseEntity<Object> response=null;
		User createdUser=service.store(user);  //user will be passed and dao.save(user) called
		response=ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
		return response;
	}
	//update the user
	
	@PutMapping(path="/user/{userId}",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateUser(@PathVariable(value="userId") int userId,  @RequestBody User user) {
		ResponseEntity<Object> response=null;
	try {
		User createdUser=service.updateUser(userId, user);  //user will be passed and dao.save(user) called
		response=ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
		
	} catch (UserNotFoundException e) {
		Custom custom = new Custom("user not found with id : "+userId ,404);
		response=ResponseEntity.status(HttpStatus.NO_CONTENT).body(custom);
		// TODO: handle exception
	}
	return response;
	}
	
	//getting all the users
	 @GetMapping(path="/user",produces=MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Object> getUsers(){
		 ResponseEntity<Object> response=null;
		 List<User> list=service.fetchAllUsers();
		 response=ResponseEntity.status(HttpStatus.OK).body(list);
		 return response;
		 	 
	 }
	

}

package com.examportal.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.exam.exception.UserFoundException;
import com.examportal.exam.models.Role;
import com.examportal.exam.models.User;
import com.examportal.exam.models.userRole;
import com.examportal.exam.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")

public class UserController {
	@Autowired
	private UserService userservice;
	
	@Autowired
	private BCryptPasswordEncoder bcryptpasswordencoder;
	
	
	//creating user
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception
	{	user.setProfile("default,png");
		
		//encoding password with bcryptpassword encoder
	
	 	user.setPassword(this.bcryptpasswordencoder.encode(user.getPassword()));
		
	 	Set<userRole> roles= new HashSet<>();
		
		Role role=new Role();
		role.setRoleId(45L);
		role.setRoleName("NORMAL");
		
		userRole userrole= new userRole();
		userrole.setUser(user);
		userrole.setRole(role);
		
		roles.add(userrole );
		
		return this.userservice.createUser(user,roles); 
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username)
	{
		return this.userservice.getUser(username);
	}
	
//	@DeleteMapping("/{username}")
//	public void deleteUserByUsername(@PathVariable("username") String username)
//	{
//		this.userservice.deleteUserbyusername(username);
//	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId)
	{
		this.userservice.deleteUser(userId);
	}
	
	 @ExceptionHandler(UserFoundException.class)
	    public ResponseEntity<?> exceptionHandler(UserFoundException ex) {
	        return ResponseEntity.ok(ex.getMessage());
	    }
	

}

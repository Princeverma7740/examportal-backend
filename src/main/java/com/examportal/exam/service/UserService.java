package com.examportal.exam.service;

import java.util.Set;

import com.examportal.exam.models.User;
import com.examportal.exam.models.userRole;

public interface UserService {
	
//creating user	
public User createUser(User user,Set<userRole> userroles) throws Exception ;

//get user by username
public User getUser(String username);

//delete user by username
//public void deleteUserbyusername(String username);

public void deleteUser(Long userId);



}

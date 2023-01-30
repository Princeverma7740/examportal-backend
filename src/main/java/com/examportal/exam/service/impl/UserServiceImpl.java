package com.examportal.exam.service.impl;

import java.util.Set;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.exam.exception.UserFoundException;
import com.examportal.exam.models.User;
import com.examportal.exam.models.userRole;
import com.examportal.exam.repo.*;
import com.examportal.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	   
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	 
	//creating user
	@Override
	public User createUser(User user,Set<userRole> userroles) throws Exception 
	{
		User local =this.userRepository.findByUsername(user.getUsername());
		if(local!=null)
		{
			System.out.println("User is already present");
			throw new UserFoundException();
		}
		else
		{
			for(userRole ur: userroles)
			{
				roleRepository.save(ur.getRole());
			}
			user.getUserrole().addAll(userroles);
			local= this.userRepository.save(user);
		}
		return local;
	}
	
	//getting user by user name
	@Override
	public User getUser( String username )
	{
		return this.userRepository.findByUsername(username);
	}

//	@Override
//	public void deleteUserbyusername(String username) {
//		// TODO Auto-generated method stub
//		 this.userRepository.deleteByUsername(username);
//		}
	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
	}
}

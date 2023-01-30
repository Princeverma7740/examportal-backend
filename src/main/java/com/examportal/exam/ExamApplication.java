package com.examportal.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.examportal.exam.models.Role;
import com.examportal.exam.models.User;
import com.examportal.exam.models.userRole;
import com.examportal.exam.service.UserService;

@SpringBootApplication

public class ExamApplication implements CommandLineRunner {
//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private BCryptPasswordEncoder bcryptpasswordencoder;
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("starting code");
		
//		User user=new User();
//		user.setFirstname("Prince");
//		user.setLastname("Kheriwal");
//		user.setUsername("Prince111");
//		user.setPassword(this.bcryptpasswordencoder.encode("123"));
//		user.setEmail("abc@gmail.com");
//		user.setPhone("123456789");
//		user.setProfile("default.png");
//
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<userRole> userRoleSet= new HashSet<>();
//		userRole userrole =new userRole();
//		userrole.setRole(role1);
//		userrole.setUser(user);
//		userRoleSet.add(userrole);
//
//		User user1=this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
//
	}

}

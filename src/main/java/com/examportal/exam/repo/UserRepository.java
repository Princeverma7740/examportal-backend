package com.examportal.exam.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examportal.exam.models.*;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	public User findByUsername(String username);

	//public void deleteByUsername(String username);

}

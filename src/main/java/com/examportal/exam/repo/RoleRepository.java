package com.examportal.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examportal.exam.models.*;
@Repository
public interface RoleRepository extends JpaRepository <Role,Long> {

}

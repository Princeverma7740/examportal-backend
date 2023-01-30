package com.examportal.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examportal.exam.models.exam.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}

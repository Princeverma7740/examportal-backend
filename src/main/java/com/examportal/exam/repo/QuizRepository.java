package com.examportal.exam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examportal.exam.models.exam.Category;
import com.examportal.exam.models.exam.Quiz;
@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {

	
	public List<Quiz> findBycategory(Category category);

    public List<Quiz> findByActive(Boolean b);

    public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}



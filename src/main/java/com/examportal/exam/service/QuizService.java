package com.examportal.exam.service;

import java.util.List;
import java.util.Set;

import com.examportal.exam.models.exam.Quiz;
import com.examportal.exam.models.exam.Category;


public interface QuizService {

	public Quiz addQuiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public Set<Quiz> getQuizzes();
	
	public Quiz getQuiz(Long quizId);
	
	public void deleteQuiz(Long quizId);

	
	
	List<Quiz> getActiveQuizzes() ;
	 List<Quiz> getActiveQuizzesOfCategory(Category c);
	 List<Quiz> getQuizzesOfCategory(Category category);
}

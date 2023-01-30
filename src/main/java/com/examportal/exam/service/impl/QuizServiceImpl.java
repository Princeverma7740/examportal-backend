package com.examportal.exam.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.exam.models.exam.Quiz;
import com.examportal.exam.repo.QuizRepository;
import com.examportal.exam.service.QuizService;
import com.examportal.exam.models.exam.Category;

@Service
@Transactional
public class QuizServiceImpl implements QuizService{
	@Autowired 
	private QuizRepository quizRepo;
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepo.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepo.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizzes() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.quizRepo.findAll());
	}

	@Override
	public Quiz getQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return this.quizRepo.findById(quizId).get(); 
	}

	@Override
	public void deleteQuiz(Long quizId) {
		// TODO Auto-generated method stub
		Quiz quiz=new Quiz();
		quiz.setqId(quizId);
		this.quizRepo.delete(quiz);
		
	}
	
	@Override
	 public List<Quiz> getQuizzesOfCategory(Category category) {
	        return this.quizRepo.findBycategory(category);
	    }
	
	@Override
	    public List<Quiz> getActiveQuizzes() {
	        return this.quizRepo.findByActive(true);
	    }
	
	@Override
	    public List<Quiz> getActiveQuizzesOfCategory(Category c) {
	        return this.quizRepo.findByCategoryAndActive(c, true);
	    }
	
	
}

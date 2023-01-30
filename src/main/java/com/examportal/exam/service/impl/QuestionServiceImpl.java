package com.examportal.exam.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.exam.models.exam.Question;
import com.examportal.exam.models.exam.Quiz;
import com.examportal.exam.repo.QuestionRepository;
import com.examportal.exam.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questionRepo;
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepo.save(question);
		
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepo.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.questionRepo.findAll());
	}

	@Override
	public Question getQuestion(Long questionId) {
		// TODO Auto-generated method stub
		return  this.questionRepo.findById(questionId).get();
	}

	@Override
	public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.questionRepo.findByQuiz(quiz);
	}

	@Override
	public void deleteQuestion(Long questionid) {
		// TODO Auto-generated method stub
		Question question = new Question();
        question.setQuesId(questionid);
        this.questionRepo.delete(question);
		
	}

	@Override
	public Question get(Long quesId) {
		// TODO Auto-generated method stub
		return this.questionRepo.getOne(quesId);
	}
	
	

}

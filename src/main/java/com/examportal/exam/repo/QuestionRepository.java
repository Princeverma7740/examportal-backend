package com.examportal.exam.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examportal.exam.models.exam.Question;
import com.examportal.exam.models.exam.Quiz;

@Repository
public interface QuestionRepository extends JpaRepository <Question,Long> {

	Set<Question> findByQuiz(Quiz quiz);

}

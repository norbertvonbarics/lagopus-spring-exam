package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.QuizQuestions;
import org.springframework.data.repository.CrudRepository;

public interface QuizQuestionRepository extends CrudRepository<QuizQuestions, Long> {

}

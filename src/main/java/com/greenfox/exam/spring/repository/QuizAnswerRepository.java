package com.greenfox.exam.spring.repository;


import com.greenfox.exam.spring.model.QuizAnswers;
import org.springframework.data.repository.CrudRepository;

public interface QuizAnswerRepository extends CrudRepository<QuizAnswers, Long>{

}

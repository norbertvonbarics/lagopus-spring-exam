package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  QuestionRepository questionRepo;
/*
  @RequestMapping("/questions")
  public Quiz quiz() {
    List<Question> questionList = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      long random = (int) (1 + Math.random() * 9);
      questionList.add(questionRepo.findOne(random));
    }

    questionList.add(questionRepo.findOne((long) 2));
    return new Quiz(questionList);
  }*/
}

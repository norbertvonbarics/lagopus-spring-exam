package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Answers;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Quiz;
import com.greenfox.exam.spring.repository.QuestionRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  QuestionRepository questionRepo;

  @RequestMapping("/questions")
  public Quiz quiz() {
    ArrayList<Question> questionList = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      long random = (int) (1 + Math.random() * 9);
      questionList.add(questionRepo.findOne(random));
    }
    return new Quiz(questionList);
  }

  @RequestMapping("/answers")
  public Answers answers(@RequestBody Answers answers) {
    return new Answers();
  }
}

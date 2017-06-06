package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Project;
import com.greenfox.exam.spring.model.ProjectList;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.QuizAnswers;
import com.greenfox.exam.spring.model.QuizQuestions;
import com.greenfox.exam.spring.repository.AnswerRepository;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.repository.QuizAnswerRepository;
import com.greenfox.exam.spring.repository.QuizQuestionRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  QuestionRepository questionRepo;

  @Autowired
  QuizQuestionRepository quizRepo;

  @Autowired
  AnswerRepository answerRepo;

  @Autowired
  QuizAnswerRepository quizAnswerRepo;

  ArrayList<Question> questionList = new ArrayList<>();

  @RequestMapping("/questions")
  public QuizQuestions quiz() {

    ArrayList<Long> randomNumberList = new ArrayList<>();
    while (questionList.size() < 5) {
      long random = (int) (1 + Math.random() * 9);
      if (!randomNumberList.contains(random)) {
        questionList.add(questionRepo.findOne(random));
        randomNumberList.add(random);
      }

    }
    return new QuizQuestions(questionList);
  }

  @RequestMapping("/answers")
  public ProjectList answer (QuizAnswers answers){
    ArrayList<Project> projectList = new ArrayList<>();


    for(int i = 0; i < answers.getAnswers().size(); i++) {
      if((answers.getAnswers().get(i).getId() == questionList.get(i).getId()) && (answers.getAnswers().get(i).getAnswer().equals(questionList.get(i).getQuestion()))){

      }
    }
  return null;
  }
}

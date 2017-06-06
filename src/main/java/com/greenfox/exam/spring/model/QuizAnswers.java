package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class QuizAnswers {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  @Column(columnDefinition = "LONGBLOB")
  ArrayList<Answer> answers;


  public QuizAnswers(ArrayList<Answer> answers) {
    this.answers = answers;
  }

  public QuizAnswers() {
  }
}

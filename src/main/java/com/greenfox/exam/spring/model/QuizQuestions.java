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
public class QuizQuestions {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  @Column(columnDefinition = "LONGBLOB")
  ArrayList<Question> questions;

  public QuizQuestions( ArrayList<Question> questions) {
    this.questions = questions;
  }

  public QuizQuestions() {
  }
}

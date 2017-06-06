package com.greenfox.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Question {

  long id;
  String question;
  String answer;

  public Question(long id, String question, String answer) {
    this.id = id;
    this.question = question;
    this.answer = answer;
  }

  public Question() {
  }
}

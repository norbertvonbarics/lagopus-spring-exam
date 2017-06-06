package com.greenfox.exam.spring.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Question {
@Id
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

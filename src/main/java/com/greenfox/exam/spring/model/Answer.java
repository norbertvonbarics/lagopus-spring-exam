package com.greenfox.exam.spring.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String answer;

  public Answer(String answer) {
    this.answer = answer;
  }

  public Answer() {
  }
}

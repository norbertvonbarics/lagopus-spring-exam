package com.greenfox.exam.spring.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Answer {

  long id;
  String answer;

  public Answer(String answer) {
    this.answer = answer;
  }

  public Answer() {
  }
}

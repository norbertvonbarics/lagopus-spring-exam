package com.greenfox.exam.spring.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Answer {

  @Id
  long id;
  String answer;

  public Answer(long id, String answer) {
    this.id = id;
    this.answer = answer;
  }

  public Answer() {
  }
}

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

  public Question(long id, String question) {
    this.id = id;
    this.question = question;
  }

  public Question() {
  }
}

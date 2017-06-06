package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Quiz {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  ArrayList<Question> questions;

  public Quiz(ArrayList<Question> questions) {
    this.questions = questions;
  }

  public Quiz() {
  }
}

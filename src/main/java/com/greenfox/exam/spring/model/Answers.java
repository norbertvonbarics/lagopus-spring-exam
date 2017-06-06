package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answers {

  long id;
  ArrayList<Answer> answers;


  public Answers(ArrayList<Answer> answers) {
    this.answers = answers;
  }

  public Answers() {
  }
}

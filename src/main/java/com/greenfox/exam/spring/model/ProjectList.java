package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  ArrayList<String> projectList;

  public ProjectList(ArrayList<String> projectList) {
    this.projectList = projectList;
  }

  public ProjectList() {
  }
}

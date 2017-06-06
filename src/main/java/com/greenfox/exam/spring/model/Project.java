package com.greenfox.exam.spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
  String nameOfProject;

  public Project(String nameOfProject) {
    this.nameOfProject = nameOfProject;
  }

  public Project() {
  }
}

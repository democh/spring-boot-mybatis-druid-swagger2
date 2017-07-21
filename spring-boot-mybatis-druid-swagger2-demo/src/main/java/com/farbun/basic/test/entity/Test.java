package com.farbun.basic.test.entity;

import java.io.Serializable;

/**
 * Created by democh on 2017/7/20.
 */
//@Entity(table = "test")
public class Test implements Serializable {

  private static final long serialVersionUID = 1L;
//  @Id
  private Long id;
  private String name;
  private Integer age;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}

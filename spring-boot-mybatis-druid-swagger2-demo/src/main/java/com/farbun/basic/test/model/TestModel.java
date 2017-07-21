package com.farbun.basic.test.model;

import com.farbun.basic.test.entity.Test;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 请求参数模型
 */
@ApiModel(value = "User", description = "用户对象")
public class TestModel {
  @ApiModelProperty(value = "ID")
  private Long id;
  @ApiModelProperty(value = "姓名")
  private String name;
  @ApiModelProperty(value = "年龄")
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

package com.impi.domain;


import javax.persistence.Id;

public class Tvalue {
  @Id
  private Integer code;
  private String name;


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

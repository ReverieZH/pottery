package com.impi.domain;


import javax.persistence.Id;

public class Texture {
  @Id
  private Integer tcode;
  private String tname;


  public Integer getTcode() {
    return tcode;
  }

  public void setTcode(Integer tcode) {
    this.tcode = tcode;
  }


  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }

}

package com.impi.domain;


import javax.persistence.Id;

public class Provinces {
  @Id
  private Integer id;
  private Integer provinceid;
  private String province;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getProvinceid() {
    return provinceid;
  }

  public void setProvinceid(Integer provinceid) {
    this.provinceid = provinceid;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

}

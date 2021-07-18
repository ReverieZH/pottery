package com.impi.domain;


import javax.persistence.Id;

public class Culture {
  @Id
  private Integer ccode;
  private String name;
  private String culBegin;
  private String culEnd;
  private String type;
  private String desc;


  public Integer getCcode() {
    return ccode;
  }

  public void setCcode(Integer ccode) {
    this.ccode = ccode;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCulBegin() {
    return culBegin;
  }

  public void setCulBegin(String culBegin) {
    this.culBegin = culBegin;
  }


  public String getCulEnd() {
    return culEnd;
  }

  public void setCulEnd(String culEnd) {
    this.culEnd = culEnd;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

}

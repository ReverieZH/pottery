package com.impi.domain;


import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Arrays;

public class Pottery {

  @Id
  private Integer code;
  private String name;
  private String type;

  @Column(name = "culCode")
  private Integer culCode;
  @Column(name = "collCode")
  private Integer collCode;
  @Column(name = "colName")
  private String colName;
  @Column(name = "colLong")
  private Double colLong;
  @Column(name = "colLat")
  private Double colLat;
  @Column(name = "siteCode")
  private Integer siteCode;
  @Column(name = "siteName")
  private String siteName;
  @Column(name = "siteLong")
  private Double siteLong;
  @Column(name = "siteLat")
  private Double siteLat;
  private Integer valure;
  private Integer classifi;
  private Double hight;
  private Double topdiameter;
  private Double botdiameter;
  private String color;
  @Column(name = "texCode")
  private Integer texCode;
  private byte[] sketch;
  private byte[] picture;
  private String description;
  private String text;

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


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Integer getCulCode() {
    return culCode;
  }

  public void setCulCode(Integer culCode) {
    this.culCode = culCode;
  }


  public Integer getCollCode() {
    return collCode;
  }

  public void setCollCode(Integer collCode) {
    this.collCode = collCode;
  }


  public String getColName() {
    return colName;
  }

  public void setColName(String colName) {
    this.colName = colName;
  }


  public Double getColLong() {
    return colLong;
  }

  public void setColLong(Double colLong) {
    this.colLong = colLong;
  }


  public Double getColLat() {
    return colLat;
  }

  public void setColLat(Double colLat) {
    this.colLat = colLat;
  }


  public Integer getSiteCode() {
    return siteCode;
  }

  public void setSiteCode(Integer siteCode) {
    this.siteCode = siteCode;
  }


  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }


  public Double getSiteLong() {
    return siteLong;
  }

  public void setSiteLong(Double siteLong) {
    this.siteLong = siteLong;
  }


  public Double getSiteLat() {
    return siteLat;
  }

  public void setSiteLat(Double siteLat) {
    this.siteLat = siteLat;
  }


  public Integer getValure() {
    return valure;
  }

  public void setValure(Integer valure) {
    this.valure = valure;
  }


  public Integer getClassifi() {
    return classifi;
  }

  public void setClassifi(Integer classifi) {
    this.classifi = classifi;
  }


  public Double getHight() {
    return hight;
  }

  public void setHight(Double hight) {
    this.hight = hight;
  }


  public Double getTopdiameter() {
    return topdiameter;
  }

  public void setTopdiameter(Double topdiameter) {
    this.topdiameter = topdiameter;
  }


  public Double getBotdiameter() {
    return botdiameter;
  }

  public void setBotdiameter(Double botdiameter) {
    this.botdiameter = botdiameter;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public Integer getTexCode() {
    return texCode;
  }

  public void setTexCode(Integer texCode) {
    this.texCode = texCode;
  }


  public byte[] getSketch() {
    return sketch;
  }

  public void setSketch(byte[] sketch) {
    this.sketch = sketch;
  }

  public byte[] getPicture() {
    return picture;
  }

  public void setPicture(byte[] picture) {
    this.picture = picture;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "Pottery{" +
            "code=" + code +
            ", name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", culCode=" + culCode +
            ", collCode=" + collCode +
            ", colName='" + colName + '\'' +
            ", colLong=" + colLong +
            ", colLat=" + colLat +
            ", siteCode=" + siteCode +
            ", siteName='" + siteName + '\'' +
            ", siteLong=" + siteLong +
            ", siteLat=" + siteLat +
            ", valure=" + valure +
            ", classifi=" + classifi +
            ", hight=" + hight +
            ", topdiameter=" + topdiameter +
            ", botdiameter=" + botdiameter +
            ", color='" + color + '\'' +
            ", texCode=" + texCode +
            ", sketch=" + Arrays.toString(sketch) +
            ", picture=" + Arrays.toString(picture) +
            ", description='" + description + '\'' +
            ", text='" + text + '\'' +
            '}';
  }
}

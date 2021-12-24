package com.bianlidian.pojo;


public class T_Address {

  private long id;
  private String contact;
  private String addressdesc;
  private String postcode;
  private String tel;
  private long createduserid;
  private java.sql.Timestamp createdtime;
  private long updateduserid;
  private java.sql.Timestamp updatedtime;
  private long userid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public String getAddressdesc() {
    return addressdesc;
  }

  public void setAddressdesc(String addressdesc) {
    this.addressdesc = addressdesc;
  }


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public long getCreateduserid() {
    return createduserid;
  }

  public void setCreateduserid(long createduserid) {
    this.createduserid = createduserid;
  }


  public java.sql.Timestamp getCreatedtime() {
    return createdtime;
  }

  public void setCreatedtime(java.sql.Timestamp createdtime) {
    this.createdtime = createdtime;
  }


  public long getUpdateduserid() {
    return updateduserid;
  }

  public void setUpdateduserid(long updateduserid) {
    this.updateduserid = updateduserid;
  }


  public java.sql.Timestamp getUpdatedtime() {
    return updatedtime;
  }

  public void setUpdatedtime(java.sql.Timestamp updatedtime) {
    this.updatedtime = updatedtime;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

}

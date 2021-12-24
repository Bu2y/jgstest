package com.test.entity;


public class T_Sys_Role {

  private long id;
  private String code;
  private String rolename;
  private long createduserid;
  private java.sql.Timestamp createdtime;
  private long updateduserid;
  private java.sql.Timestamp updatedtime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
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

}

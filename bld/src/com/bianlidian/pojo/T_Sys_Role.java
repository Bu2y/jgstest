package com.bianlidian.pojo;


public class T_Sys_Role {

  private long id;
  private String code;
  private String rolename;
  private long createduserid;
  private java.util.Date createdtime;
  private long updateduserid;
  private java.util.Date updatedtime;
    public String getlename;


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


  public java.util.Date getCreatedtime() {
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


  public java.util.Date getUpdatedtime() { return updatedtime; }

  public void setUpdatedtime(java.sql.Timestamp updatedtime) {
    this.updatedtime = updatedtime;
  }

}

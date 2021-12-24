package com.test.entity;


import java.util.List;

public class T_Sys_User {

  private long id;
  private String account;
  private String realName;
  private String password;
  private long sex;
  private java.util.Date birthday;
  private String phone;
  private String address;
  private long roleid;
  private long createduserid;
  private java.sql.Timestamp createdtime;
  private long updateduserid;
  private java.sql.Timestamp updatedtime;
  private String rolename;
  private List<T_Address> addresses;
  private T_Sys_Role role;



  public List<T_Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<T_Address> addresses) {
    this.addresses = addresses;
  }


  public T_Sys_Role getRole() {
    return role;
  }

  public void setRole(T_Sys_Role role) {
    this.role = role;
  }




  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }




  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public java.util.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.util.Date birthday) {
    this.birthday = birthday;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
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

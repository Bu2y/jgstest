package com.bianlidian.pojo;


import java.util.Date;
import java.util.List;

public class T_Sys_User {

  private long id;
  private String account;
  private String realname;
  private String password;
  private long sex;
  private Date birthday;
  private String phone;
  private String address;
  private long roleid;
  private long createduserid;
  private Date createdtime;
  private long updateduserid;
  private java.util.Date updatedtime;
  private String rolename;
  private List<T_Address> addressList;

  public List<T_Address> getAddressList() {
    return addressList;
  }

  public void setAddressList(List<T_Address> addressList) {
    this.addressList = addressList;
  }

  public T_Sys_Role getGetRolen() {
    return getRolen;
  }

  public void setGetRolen(T_Sys_Role getRolen) {
    this.getRolen = getRolen;
  }

  public T_Sys_Role getRolen;


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


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
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


  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
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

  public void setUpdatedtime() {
    this.updatedtime = updatedtime;
  }

  public long getCreateduserid() {
    return createduserid;
  }

  public void setCreateduserid(long createduserid) {
    this.createduserid = createduserid;
  }


  public Date getCreatedtime() {
    return createdtime;
  }

  public void setCreatedtime(Date createdtime) {
    this.createdtime = createdtime;
  }


  public long getUpdateduserid() {
    return updateduserid;
  }

  public void setUpdateduserid(long updateduserid) {
    this.updateduserid = updateduserid;
  }


  public Date getUpdatedtime() { return updatedtime; }

  public void setUpdatedtime(java.sql.Timestamp updatedtime) {
    this.updatedtime = updatedtime;
  }


  public void setBirthday(Date d1) {
  }
}

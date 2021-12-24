package com.test.entity;

public class Userinfo {

  private String username;
  private String password;
  private String email;


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Userinfo() {
  }

  //新增
  public Userinfo(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }

  /**
   * 登录
   * @param username
   * @param password
   */
  public Userinfo(String username, String password) {
    this.username = username;
    this.password = password;
  }
}
